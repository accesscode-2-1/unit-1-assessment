package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by amyquispe on 5/19/15.
 */


public class AwesomeContainer {

    static ArrayList<ConcreteAwesomeClass> container = new ArrayList<ConcreteAwesomeClass>();


    public static Collection createAwesomeContainer(){
        return container;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        ConcreteAwesomeClass meow = new ConcreteAwesomeClass();
        container.add(meow);
        awesomeContainer.add(container);
    }
}
