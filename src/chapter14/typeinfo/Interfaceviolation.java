package chapter14.typeinfo;

import chapter14.typeinfo.interfacea.A;

/**
 * Created by Changjiang on 2016/6/28.
 */
class  B implements A {
    public void f(){}
    public void g(){}
}
public class Interfaceviolation {
    public static void main(String[] args) {
        A a=new B();
        a.f();
        System.out.println(a.getClass().getName());
        if(a instanceof B){
            B b=(B)a;
            b.g();
        }
    }
}
