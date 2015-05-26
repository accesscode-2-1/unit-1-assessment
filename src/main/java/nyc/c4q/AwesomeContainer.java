package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {

    private static Collection col;

    public static Collection createAwesomeContainer() {

        col = new ArrayList();

        return null;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        awesomeContainer.add(col.getClass());
    }
}
