package polymorphism;

/**
 * Created by Changjiang on 2015/6/14.
 */

public class PrivateOverride {
    private void f(){
        System.out.println("PrivateOverride.f()");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride=new Derived();
        privateOverride.f();
    }
}
class Derived extends  PrivateOverride{
    public void f(){
        System.out.println("Derived.f()");
    }
}