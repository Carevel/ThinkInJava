package utils;

/**
 * Created by Changjiang on 2016/6/29.
 */
public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
    public final D d;
    public FourTuple(A a,B b ,C c,D d){
        super(a,b,c);
        this.d=d;
    }

    @Override
    public String toString() {
        return "("+a+","+b+","+c+","+d+")";
    }
}
