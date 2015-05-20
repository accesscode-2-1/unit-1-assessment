package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class ConcreteAwesomeClass extends AbstractAwesomeClass {

    int startData;

    public ConcreteAwesomeClass(){

    }
    public ConcreteAwesomeClass(int startData){
        this.startData=startData;
    }

    @Override
    public int getData() {
        return startData;
    }

    @Override
    public void setData(int someData) {
       this.startData = someData;
    }
}
