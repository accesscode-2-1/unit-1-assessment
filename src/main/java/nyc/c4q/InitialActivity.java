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
  private static final String TOTAL_COUNT = "Total_Count";
  private String totalCount = "";
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

      Log.d(TAG, "onCreate(), counter="+counter);

    if (savedInstanceState != null) {
        counter = (Integer)savedInstanceState.get(TOTAL_COUNT);
    }



    setContentView(R.layout.activity_initial);
    preferences = getPreferences(Context.MODE_PRIVATE);

      final TextView tvCounter = (TextView)findViewById(R.id.tvCounter);

      Button buttonPlus = ((Button)this.findViewById(R.id.buttonPlus));

      buttonPlus.setOnClickListener(new View.OnClickListener() {

          @Override
          public void onClick(View view) {
              counter++;
              Log.d(TAG, "buttonPlus.onClick(), counter="+counter);
              tvCounter.setText(""+counter);
          }
      });
//      buttonPlus.setOnClickListener(new MyOnClickListner(tvCounter));

      Button buttonMinus = ((Button)this.findViewById(R.id.buttonMinus));
      buttonMinus.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              counter--;
              Log.d(TAG, "buttonMinus.onClick(), counter="+counter);
              tvCounter.setText(""+counter);
          }
      });
//      buttonMinus.setOnClickListener(new MyOnClickListnerMinus(tvCounter));

      totalCount = ""+counter;
  }




    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(TOTAL_COUNT, counter);
    }
}
