package chapter15.generics2;

import java.util.Objects;

/**
 * Created by Changjiang on 2016/11/02.
 */
public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }
    public void set(Object a){
        this.a=a;
    }
    public Object get(){
        return a;
    }

    public static void main(String[] args) {
    }
}
