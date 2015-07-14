package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InitialActivity extends Activity {

    public int counter = 0;
    public SharedPreferences preferences = null;
    public final static String TAG = "C4QTAG";

    public void loadState() {
        Log.d(TAG, "loadState()");
        counter = preferences.getInt("counter", 0);
        Log.d(TAG, "loadState(): counter==" + counter);
    }

    public void saveState() {
        Log.d(TAG, "saveState()");
        Log.d(TAG, "saveState(): counter==" + counter);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("counter", counter);
        editor.commit();
    }


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        preferences = getPreferences(Context.MODE_PRIVATE);

        loadState();

        final Button button = (Button) findViewById(R.id.buttonPlus);
        final TextView countertv = (TextView) findViewById(R.id.tvCounter);

        if(savedInstanceState!=null){
            counter= Integer.parseInt(savedInstanceState.get("click_count").toString());
            saveState();
            countertv.setText(counter);

        }

            button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                counter++;
                saveState();
                countertv.setText(String.valueOf(counter));

            }

        });

        Button buttonMin = (Button) findViewById(R.id.buttonMinus);
        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                saveState();
                countertv.setText(String.valueOf(counter));

            }
        });

        Button buttonTile = (Button) findViewById(R.id.buttonTileActivity);
        buttonTile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InitialActivity.this, TileActivity.class);
                startActivity(intent);

            }
        });

        saveState();

    }

    protected void onPause(){
        super.onPause();
        saveState();
    }

    protected void onResume(){
        super.onResume();
        loadState();
    }
}