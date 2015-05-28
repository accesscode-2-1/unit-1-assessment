package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {
    public static Collection createAwesomeContainer(){

        return new ArrayList();
    }

    public static void addAwesomeObject(Collection awesomeContainer){

        ConcreteAwesomeClass classAdd= new ConcreteAwesomeClass();

        awesomeContainer.add(classAdd);
    }
}
