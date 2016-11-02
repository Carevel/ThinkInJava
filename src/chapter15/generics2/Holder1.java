package chapter15.generics2;

/**
 * Created by Changjiang on 2016/11/02.
 */
class Automobile{}
public class Holder1 {
    private  Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }
    Automobile get(){
        return  a;
    }
}
