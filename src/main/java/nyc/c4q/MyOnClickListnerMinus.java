package nyc.c4q;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Hoshiko on 5/19/15.
 */
public class MyOnClickListnerMinus implements View.OnClickListener{
    int count = 0;

    TextView textView;


    public MyOnClickListnerMinus(TextView textView){
        this.textView = textView;

    }


    @Override
    public void onClick (View view){
        count--;

        textView.setText(""+count);

    }


}
