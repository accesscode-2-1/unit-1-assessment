package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public class SubFunClass extends SuperFunClass {
    public SubFunClass(){
        SubFunClass funObject = new SubFunClass();
    }
}

//    @Test
//    public void test01SubFunClassInheritsFromSuperFunClass() throws Exception {
//        SubFunClass funObject = new SubFunClass();
//        assertThat(funObject, instanceOf(SuperFunClass.class));