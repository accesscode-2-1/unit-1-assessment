package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class SubFunClass extends SuperFunClass implements AwesomeInterface{
    public int data = 4;
    public SubFunClass(){
    }

    @Override
    public int getData() {
        return data;
    }

    @Override
    public void setData(int someData) {
        this.data = someData;
    }
}
