package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class InitialActivity extends Activity {

  public int counter = 0;
  public SharedPreferences preferences = null;
  public final static String TAG = "C4QTAG";

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

      final TextView tvCounter = (TextView) findViewById(R.id.tvCounter);

      Button plusButton = (Button) findViewById(R.id.buttonPlus);
      Button minusButton = (Button) findViewById(R.id.buttonMinus);

      ArrayList<Button> buttons = new ArrayList<Button>();
      buttons.add(plusButton);
      buttons.add(minusButton);

      for (Button button : buttons) {
          button.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View view) {
                  switch (view.getId()) {
                      case R.id.buttonPlus:
                          counter += 1;
                          tvCounter.setText(counter+"");
                          break;
                      case R.id.buttonMinus:
                          counter -= 1;
                          tvCounter.setText(counter+"");
                          break;
                  }
              }
          });
      }
  }
}
