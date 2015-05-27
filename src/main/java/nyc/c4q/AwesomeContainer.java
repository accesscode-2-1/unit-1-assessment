package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {

    public static ArrayList cow = new ArrayList();

    public static Collection createAwesomeContainer(){

        return cow;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        ConcreteAwesomeClass boo = new ConcreteAwesomeClass();
        cow.add(boo);


    }
}
