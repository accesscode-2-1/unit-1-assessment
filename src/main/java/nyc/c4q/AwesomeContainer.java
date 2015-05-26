package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {
    public static Collection createAwesomeContainer(){
        return new ArrayList<AwesomeInterface>();
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        awesomeContainer.add(new ConcreteAwesomeClass());
    }
}
