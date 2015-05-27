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

  public void loadState(){
    Log.d(TAG, "loadState()");
    counter = preferences.getInt("counter", 0);
    Log.d(TAG, "loadState(): counter==" + counter);
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

      if (savedInstanceState != null) {
          counter = savedInstanceState.getInt("counter", counter);
      } else {
          Button tileActivityButton = (Button) findViewById(R.id.buttonTileActivity);
          tileActivityButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent = new Intent(InitialActivity.this, TileActivity.class);
                  startActivity(intent);
              }
          });
      }

  }

    public void buttonPlus(View v){
        TextView tvcounter = (TextView) findViewById(R.id.tvCounter);
        counter = Integer.parseInt(tvcounter.getText().toString());
                counter++;
            tvcounter.setText(String.valueOf(counter));

    }
    public void buttonMinus(View v){
        TextView tvcounter = (TextView) findViewById(R.id.tvCounter);
        counter = Integer.parseInt(tvcounter.getText().toString());
        counter--;
        tvcounter.setText(String.valueOf(counter));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        loadState();
        saveState();
        outState.putInt("counter", counter);
    }
}
