package chapter15.generics;

/**
 * Created by Changjiang on 2016/11/05.
 */
class Automobile{}
public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a) {
        this.a = a;
    }
    Automobile get(){
        return a;
    }
}
