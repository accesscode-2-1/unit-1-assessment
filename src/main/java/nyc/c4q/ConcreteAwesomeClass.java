package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class ConcreteAwesomeClass extends AbstractAwesomeClass {




    @Override
    public int getData() {
        return 5;
    }

    @Override
    public void setData(int someData) {
        super.setData(someData);
    }

    public ConcreteAwesomeClass(){
    }
    public ConcreteAwesomeClass(int startData){
    }
}
