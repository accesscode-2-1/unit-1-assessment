package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InitialActivity extends Activity implements View.OnClickListener {

  Button plus;
  Button minus;
  Button empty;
  TextView tvCounter;
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

    plus = (Button)findViewById(R.id.buttonPlus);
    minus = (Button)findViewById(R.id.buttonMinus);
    empty = (Button)findViewById(R.id.buttonEmpty);
    tvCounter = (TextView)findViewById(R.id.tvCounter);

      plus.setOnClickListener(this);
      minus.setOnClickListener(this);
      empty.setOnClickListener(this);

    preferences = getPreferences(Context.MODE_PRIVATE);
  }

  @Override
  public void onClick(View v){
    if (v == plus){
        counter++;
        tvCounter.setText(Integer.toString(counter));
    }
    if (v == minus){
        counter--;
        tvCounter.setText(Integer.toString(counter));
    }
    if (v == empty){
        counter = 0;
        tvCounter.setText(Integer.toString(counter));
    }
  }


}
