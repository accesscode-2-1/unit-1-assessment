package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class ConcreteAwesomeClass extends AbstractAwesomeClass {
    int data;

    public ConcreteAwesomeClass(){
        this.data = 4;
    }
    public ConcreteAwesomeClass(int startData){
        this.data = startData;
    }

//    @Override
//    public int getData() {
//        return data;
//    }
//
//    @Override
//    public void setData(int someData) {
//        this.data = someData;
//    }
}
