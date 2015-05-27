package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InitialActivity extends Activity {

    public int counter = 0;
    public SharedPreferences preferences = null;
    public final static String TAG = "C4QTAG";
    public TextView tvCounter;

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
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        preferences = getPreferences(Context.MODE_PRIVATE);
        tvCounter = (TextView) findViewById(R.id.tvCounter);


        if (savedInstanceState != null) {
            tvCounter.setText(savedInstanceState.getString("counter").toString());
        }


        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                counter++;
                tvCounter.setText(String.valueOf(counter));
                savePreferences("counter", tvCounter.getText().toString());
            }

        });


        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                tvCounter.setText(String.valueOf(counter));
                savePreferences("counter", tvCounter.getText().toString());
            }
        });


        Button buttonTileActivity = (Button) findViewById(R.id.buttonTileActivity);
        buttonTileActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextStartedActivity = new Intent(getApplicationContext(), TileActivity.class);
                startActivity(nextStartedActivity);
            }
        });


        loadSavedPreferences();

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putString("counter", tvCounter.getText().toString());

    }



    private void savePreferences(String key, String value) {

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("counter", tvCounter.getText().toString());
        editor.commit();
    }

    private void loadSavedPreferences() {

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        tvCounter.setText(sharedPreferences.getString("counter", tvCounter.getText().toString()));

    }

}
