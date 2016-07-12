package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/10.
 */
public class Manipulator2<T extends HasF> {
    private T obj;
    public Manipulator2(T x){obj=x;}
    public void manipulate(){obj.f();}
}
