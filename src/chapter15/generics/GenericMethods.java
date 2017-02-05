package chapter15.generics;

/**
 * Created by Changjiang on 2016/11/21.
 */
public class GenericMethods {
    public <T> void f(T t) {
        System.out.println(t.getClass().getSimpleName());
    }

    public <A, B> void f(A a, B b) {
        System.out.println(a.getClass().getSimpleName() + " " + b.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f('c');
    }
}
