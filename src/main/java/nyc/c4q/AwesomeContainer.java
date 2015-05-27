package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {

    public static Collection createAwesomeContainer(){
        ArrayList myList = new ArrayList();
        addAwesomeObject(myList);
        return myList;
    }

    public static void addAwesomeObject(Collection awesomeContainer){

        ConcreteAwesomeClass awesomeStuff = new ConcreteAwesomeClass();


        awesomeContainer.add(awesomeStuff);

        return;
    }
}
