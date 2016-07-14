package utils;

/**
 * Created by Changjiang on 2016/07/03.
 */
public class Tuple {
    public static <A,B> TwoTuple<A,B> tuple(A a,B b){
        return new TwoTuple<A, B>(a,b);
    }
    public static <A,B,C> ThreeTuple<A,B,C> threeTuple(A a,B b,C c){
        return new ThreeTuple<A, B, C>(a,b,c);
    }
    public static <A,B,C,D> FourTuple<A,B,C,D> fourTuple(A a,B b,C c,D d){
        return new FourTuple<A, B, C, D>(a,b,c,d);
    }
}
