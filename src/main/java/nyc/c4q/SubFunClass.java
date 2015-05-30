package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */

public class SubFunClass extends SuperFunClass implements AwesomeInterface{
    int data;

    public SubFunClass(){
        super("OMG");
    }

    public int getData() {
        return data;
    }

    public void setData(int someData) {
        this.data = someData;
    }


}
