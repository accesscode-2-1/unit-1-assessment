package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class SubFunClass extends SuperFunClass implements AwesomeInterface{
    int data;

    public SubFunClass(){
    }

    @Override
    public int getData() {
        return data;
    }

    @Override
    public void setData(int someData) {
        data = someData;
    }
}
