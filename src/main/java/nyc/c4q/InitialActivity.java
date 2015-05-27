package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate(): counter==" + counter);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        preferences = getPreferences(Context.MODE_PRIVATE);

        Button plus = (Button) findViewById(R.id.buttonPlus);
        Button minus = (Button) findViewById(R.id.buttonMinus);
        final TextView tvCounter = (TextView) findViewById(R.id.tvCounter);

        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        counter++;
                        Log.d(TAG, "plus:" + counter);
                        tvCounter.setText(String.valueOf(counter));
                    }
                }
        );

        minus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        counter--;
                        Log.d(TAG, "minus:" + counter);
                        tvCounter.setText(String.valueOf(counter));
                    }
                }
        );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }
}
