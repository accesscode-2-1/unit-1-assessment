package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {

    private static ArrayList myList = new ArrayList();
    private static ConcreteAwesomeClass o = new ConcreteAwesomeClass();

    public static Collection createAwesomeContainer(){

        return myList;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        awesomeContainer.add(o);
    }
}
