package nyc.c4q;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by c4q-joshelynvivas on 5/19/15.
 */
public interface List <E> extends Collection{

    @Override
    boolean addAll(Collection collection);

    @Override
    boolean contains(Object o);

    @Override
    boolean containsAll(Collection collection);
}
