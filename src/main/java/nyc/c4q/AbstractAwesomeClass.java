package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public abstract class AbstractAwesomeClass implements AwesomeInterface {

    public int data;

    @Override
    public int getData() {
        return 4;
    }

    @Override
    public void setData(int someData) {
       this.data = someData;
    }


}
