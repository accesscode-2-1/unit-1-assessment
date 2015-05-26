package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {
    static ArrayList c;

    public static Collection createAwesomeContainer(){
        c = new ArrayList();
        return (List) c;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        awesomeContainer.add(new ConcreteAwesomeClass());
    }

}
