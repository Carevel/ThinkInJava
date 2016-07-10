package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/03.
 */
public class CountObject {
    private static long count=0;
    private final long id=count++;
    public long id(){
        return id;
    }

    @Override
    public String toString() {
        return "CountObject:"+id();
    }
}
