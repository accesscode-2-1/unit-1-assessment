package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {
    static ArrayList awesomeStuff;

    public static Collection createAwesomeContainer(){
        awesomeStuff = new ArrayList();
        return (List) awesomeStuff;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        awesomeContainer.add(new ConcreteAwesomeClass());
        awesomeContainer.add(new ConcreteAwesomeClass());
        return;

    }
}
