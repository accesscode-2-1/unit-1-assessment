package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {
    public static Collection createAwesomeContainer(){
      Collection c = new ArrayList();
      return  c;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        ConcreteAwesomeClass cac = new ConcreteAwesomeClass();
        awesomeContainer.add(cac);

    }
}
