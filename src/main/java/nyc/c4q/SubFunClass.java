package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class SubFunClass extends SuperFunClass implements AwesomeInterface{
    int Data;

    public SubFunClass(){
    }

    @Override
    public int getData() {

        return this.Data;
    }

    @Override
    public void setData(int someData) {
        someData = this.Data;
    }
}
