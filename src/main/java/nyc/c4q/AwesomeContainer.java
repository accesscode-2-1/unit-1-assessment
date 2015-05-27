package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {

   private static ArrayList myList;

    public static Collection createAwesomeContainer() {

        myList = new ArrayList();

        return myList;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        ConcreteAwesomeClass cc = new ConcreteAwesomeClass();
        myList.add(cc);
    }
}
