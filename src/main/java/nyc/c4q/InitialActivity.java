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
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
            TextView tv = (TextView)findViewById(R.id.tvCounter);
            tv.setText(savedInstanceState.get("Counter").toString());

    }

    @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_initial);
    preferences = getPreferences(Context.MODE_PRIVATE);



  }

    public void myclick(View v){

        TextView tv = (TextView)findViewById(R.id.tvCounter);

        if(v.getId()==R.id.buttonPlus){
            counter ++;
            tv.setText(String.valueOf(counter));
        }
        if(v.getId()==R.id.buttonMinus){
            counter =counter-1;
            tv.setText(String.valueOf(counter));
        }
        if(v.getId()==R.id.buttonTileActivity){
            Intent i = new Intent(this, TileActivity.class);
            startActivity(i);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView tv = (TextView)findViewById(R.id.tvCounter);
        outState.putString("Counter", tv.getText().toString());
    }


}
