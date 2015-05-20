package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public abstract class AbstractAwesomeClass implements AwesomeInterface {

    AbstractAwesomeClass awesomeObject = new ConcreteAwesomeClass();
    awesomeObject.setData(5);





    @Override
    public int getData() {
        return 5;
    }

    @Override
    public  void setData(int someData) {
    someData = 5;
    }
}
