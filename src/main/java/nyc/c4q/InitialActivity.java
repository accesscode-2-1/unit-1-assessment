package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class InitialActivity extends Activity {

  public int counter = 0;
  public SharedPreferences preferences = null;
  public final static String TAG = "C4QTAG";
  public TextView tvCounter;

    private static final String COUNTER_KEY = "counter";

  public void loadState(){
    Log.d(TAG, "loadState()");
    counter = preferences.getInt("counter", 0);
    Log.d(TAG, "loadState(): counter=="+counter);
  }

  public void saveState(){
    Log.d(TAG, "saveState()");
    Log.d(TAG, "saveState(): counter=="+counter);
    SharedPreferences.Editor editor = preferences.edit();
    editor.putInt("counter", counter);
    editor.commit();
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_initial);
    preferences = getPreferences(Context.MODE_PRIVATE);

      LinearLayout layout = (LinearLayout) findViewById(R.id.activity_initial);

      tvCounter = (TextView) findViewById(R.id.tvCounter);

      Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
      buttonPlus.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              counter++;
              tvCounter.setText("" + counter);
              Log.d("C4QTAG", "onCreate().buttonPlus.inside: " + counter);
          }
      });

      Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
      buttonMinus.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              counter--;
              tvCounter.setText("" + counter);
              Log.d("C4QTAG", "onCreate().buttonMinus.inside: " + counter);
          }
      });

      Log.d("C4QTAG", "onCreate().outside: " + counter);

      Button buttonTileActivity = (Button) findViewById(R.id.buttonTileActivity);
      buttonTileActivity.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(InitialActivity.this, TileActivity.class);
              startActivity(intent);
          }
      });

      if(savedInstanceState!=null) {
          counter = savedInstanceState.getInt(COUNTER_KEY);
          tvCounter.setText("" + counter);
      }
  }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNTER_KEY, counter);
    }
}
