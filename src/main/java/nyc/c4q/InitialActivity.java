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

public class InitialActivity extends Activity {

  Button buttonPlus;
  Button buttonMinus;
  TextView tvCounter;

  Button buttonTileActivity;

  public int counter = 0;
  public SharedPreferences preferences = null;
  public final static String TAG = "C4QTAG";

  public void loadState(){
    Log.d(TAG, "loadState()");
    counter = preferences.getInt("counter", 0);
    Log.d(TAG, "loadState(): counter==" + counter);
  }

  public void saveState(){
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

    buttonPlus = (Button) findViewById(R.id.buttonPlus);
    buttonMinus = (Button) findViewById(R.id.buttonMinus);
    tvCounter = (TextView) findViewById(R.id.tvCounter);

    buttonTileActivity = (Button) findViewById(R.id.buttonTileActivity);

    SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
    tvCounter.setText(sharedPref.getString("tvCounter", "0"));


    if (savedInstanceState != null) {
      tvCounter.setText(savedInstanceState.getString("tvCounter"));
    }


    buttonPlus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        counter = Integer.parseInt(tvCounter.getText().toString());
        counter++;
        tvCounter.setText(counter + "");
      }
    });

    buttonMinus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        counter = Integer.parseInt(tvCounter.getText().toString());
        counter--;
        tvCounter.setText(counter + "");
      }
    });

    buttonTileActivity.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), TileActivity.class);
        startActivity(intent);
      }
    });

    preferences = getPreferences(Context.MODE_PRIVATE);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);

  }

  @Override
  protected void onPause() {
    super.onPause();

    SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString("tvCounter", tvCounter.getText().toString());
    editor.commit();
  }
}
