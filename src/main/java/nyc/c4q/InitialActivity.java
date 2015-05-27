package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class InitialActivity extends Activity implements View.OnClickListener {

  public  static int counter = 0;
  public SharedPreferences preferences = null;
  public final static String TAG = "C4QTAG";
    TextView tvCounter;
    Button buttonPlus;
    Button buttonMinus;



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
      Log.d(TAG, "onCreate()");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_initial);
    preferences = getPreferences(Context.MODE_PRIVATE);

      tvCounter = (TextView) findViewById(R.id.tvCounter);
      buttonPlus = (Button) findViewById(R.id.buttonPlus);
      buttonMinus = (Button) findViewById(R.id.buttonMinus);
      Button buttonTileActivity = (Button) findViewById(R.id.buttonTileActivity);
      Button buttonEmpty = (Button) findViewById(R.id.buttonEmpty);
      loadState();

      if (savedInstanceState != null) {
          int mCurrentCounter = savedInstanceState.getInt(String.valueOf(counter));
      }
      }

    @Override
    protected void onStart() {
        super.onStart();
        saveState();    }

    @Override
    protected void onResume() {
        super.onResume();
        tvCounter.getText();
    }


    public void onClick (View v) {

        Log.d(TAG, "onClick()");
        if(v.getId()==R.id.buttonPlus){
            counter += 1;
            Log.d(TAG, "onClick().buttonPlus, counter="+counter);
            tvCounter.setText(String.valueOf(counter));
        }
        if (v.getId()==R.id.buttonMinus) {
            counter -= 1;
            Log.d(TAG, "onClick().buttonMinus, counter="+counter);
            tvCounter.setText(String.valueOf(counter));

        }
    }
    @Override
    protected void onSaveInstanceState(Bundle state) {
//        state.get(String.valueOf(counter));


        super.onSaveInstanceState(state);
//        int mCurrentCounter = getInt(counter);
        state.putInt("mCurrentCounter", counter);
        Log.d("InitialActivity", "onSaveInstanceState");

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
