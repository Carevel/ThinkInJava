package chapter15.generics;

import utils.TwoTuple;

import static utils.Tuple.tuple;

/**
 * Created by Changjiang on 2016/07/03.
 */
public class TupleTest2 {
    /**
     * 参数的TwoTuple对象
     * @return
     */
    static TwoTuple<String,Integer> f(){
        return tuple("hi",47);
    }

    /**
     * 非参数化的TwoTuple对象
     * @return
     */
    static TwoTuple f2(){
        return tuple("hi",47);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> twoTuple=f();
        System.out.println(f2());
    }
}
