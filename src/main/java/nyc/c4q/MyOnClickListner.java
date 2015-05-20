package nyc.c4q;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Hoshiko on 5/19/15.
 */
public class MyOnClickListner implements View.OnClickListener{
    int count = 0;
    static int totalCount=0;
    TextView textView;
    TextView textViewTotal;

    public MyOnClickListner(TextView textView){
        this.textView = textView;

    }


    @Override
    public void onClick (View view){
        count++;
        totalCount++;
        textView.setText(""+count);

    }
}

