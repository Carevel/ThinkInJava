package chapter15.generics;

/**
 * Created by Changjiang on 2016/6/28.
 */
class A{}
class B extends A{}
public class Holder4 {
    public static void main(String[] args) {
        Holder3<A> h3=new Holder3<A>(new B());
    }
}
