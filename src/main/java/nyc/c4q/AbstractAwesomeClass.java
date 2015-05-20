package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public abstract class AbstractAwesomeClass implements AwesomeInterface {
    private int save = 4;

    @Override
    public int getData() {
        return this.save;
    }


    @Override
    public void setData(int someData) {
        this.save = someData;
    }
}
