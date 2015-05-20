package nyc.c4q;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TileActivity extends Activity {

//    public Color ColorDrawable(int colorRed){
//
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tile);

        View redView = findViewById(R.id.redView);
        View greenView = findViewById(R.id.greenView);
        View yelloWView = findViewById(R.id.yellowView);
        View blueView = findViewById(R.id.blueView);
        redView.setBackgroundColor(Color.RED);
        greenView.setBackgroundColor(Color.GREEN);
        blueView.setBackgroundColor(Color.BLUE);
        yelloWView.setBackgroundColor(Color.YELLOW);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tiles, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
