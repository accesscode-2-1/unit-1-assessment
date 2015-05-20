package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by amyquispe on 5/19/15.
 */
public class AwesomeContainer {
    public static Collection createAwesomeContainer(){
        List<AwesomeInterface> list = new ArrayList<AwesomeInterface>();
        return list;
    }

    public static void addAwesomeObject(Collection awesomeContainer){
        awesomeContainer = AwesomeContainer.createAwesomeContainer();
        awesomeContainer.add(new SubFunClass());
        return ;
    }
}
