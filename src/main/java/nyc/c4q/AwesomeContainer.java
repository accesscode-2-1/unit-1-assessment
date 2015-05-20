package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {
    public static ArrayList<AwesomeInterface> createAwesomeContainer(){
        ArrayList list = new ArrayList<AwesomeInterface>();
        return list;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        awesomeContainer.add(new SubFunClass());

    }
}
