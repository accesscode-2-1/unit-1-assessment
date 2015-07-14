package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class SubFunClass extends SuperFunClass {
    public SubFunClass (){
        SubFunClass funObject = new SubFunClass();
    }

    public SubFunClass(String someName) {
        super(someName);
    }
}
