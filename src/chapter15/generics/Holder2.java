package chapter15.generics;

import chapter14.typeinfo.Interfaceviolation;

/**
 * Created by Changjiang on 2016/6/28.
 */
public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder2 h2=new Holder2(new AutoMobile());
        AutoMobile a= (AutoMobile) h2.getA();

        h2.setA("Not an AutoMobile");
        String s=(String)h2.getA();

        h2.setA(1);
        Integer x=(Integer)h2.getA();
    }
}
