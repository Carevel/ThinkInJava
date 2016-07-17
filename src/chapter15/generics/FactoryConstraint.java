package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/14.
 */
interface FactoryI<T>{
    T create();
}
class Foo2<T>{
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory){
        x=factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer>{

    @Override
    public Integer create() {
        return new Integer(0);
    }
}
public class FactoryConstraint {
    public static void main(String[] args) {
        Foo2<Integer> foo2=new Foo2<Integer>(new IntegerFactory());
    }
}
