package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class SubFunClass extends SuperFunClass implements AwesomeInterface{
    public SubFunClass(){
    }

    @Override
    public int getData() {
        setData(0);
        return 0;
    }

    @Override
    public void setData(int someData) {
    }
}
