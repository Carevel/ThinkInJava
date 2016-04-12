package Chapter7;

/**
 * Created by Changjiang on 2015/6/11.
 */
class WithFinals{
    private String name;
    private final void f(){}
    private void g(){}
}
class OverridePrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridePrivate.f()");
    }

    private void g(){
        System.out.println("OverridePrivate.g()");
    }
}
class OverridePrivate2 extends OverridePrivate{
    public final void f(){
        System.out.println("OverridePrivate2.f()");
    }

    public void g(){
        System.out.println("OverridePrivate2.g()");
    }
}
public class FinalOverrideIllusion {
}
