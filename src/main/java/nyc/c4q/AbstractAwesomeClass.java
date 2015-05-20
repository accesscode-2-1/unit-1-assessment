package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public abstract class AbstractAwesomeClass implements AwesomeInterface {

    int num = 4;

    @Override
    public int getData() {
        return num;
    }

    @Override
    public void setData(int someData) {
        num = someData;
    }
}
