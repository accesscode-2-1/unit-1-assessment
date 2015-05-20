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

  public int counter = 0;
  public SharedPreferences preferences = null;
  public final static String TAG = "C4QTAG";
  private TextView tvCounter;
  private Button tileActivity;

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
    loadState();

    tvCounter = (TextView) findViewById(R.id.tvCounter);
    tvCounter.setText("" + counter);

  }

    @Override
    protected void onPause() {
        saveState();
        super.onPause();
    }

  public void tvPlus(View view) {
      counter += 1;
      tvCounter.setText("" + counter);
  }

  public void tvMinus(View view) {
      counter -= 1;
      tvCounter.setText("" + counter);
  }

  public void startTileActivity(View view) {
      Intent tileIntent = new Intent(this, TileActivity.class);
      startActivity(tileIntent);
  }
}
