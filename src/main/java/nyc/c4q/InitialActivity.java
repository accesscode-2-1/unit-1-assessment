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
    private int textCount;
    private TextView tvCount;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button tileActivity;

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
    protected void onPause() {
        saveState();
        super.onPause();
    }

    @Override
  protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);


        preferences = getPreferences(Context.MODE_PRIVATE);
        loadState();


        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        tvCount = (TextView) findViewById(R.id.tvCounter);
        tvCount.setText("" + counter);

//        if ((preferences != null)) {
//            loadState();
//            textCount = preferences.getInt("counter", counter);
//        } else {
//            textCount = -1;
//
//            //textCount = Integer.parseInt( (String) tvCount.getText());
//        }

        View redView = findViewById(R.id.redView);
        //redView.setBackground(-65536);


        Button tileActivityBtn = (Button) findViewById(R.id.buttonTileActivity);
        tileActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InitialActivity.this, TileActivity.class);
                startActivity(intent);
            }
        });
    }


     public void onPlusClick(View view) {
            counter += 1;
            tvCount.setText("" + counter);
     }

      public void onMinusClick(View view) {
          counter -= 1;
           tvCount.setText("" + counter);
      }



  }




