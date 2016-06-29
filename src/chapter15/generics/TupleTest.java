package chapter15.generics;

import utils.ThreeTuple;
import utils.TwoTuple;

/**
 * Created by Changjiang on 2016/6/29.
 */
class Amphibian{}
class Vehicle{}
public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<String, Integer>("hi",47);
    }
    static ThreeTuple<Amphibian,String,Integer> h(){
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(),"hi",47);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi=f();
        System.out.println(ttsi);
        System.out.println(h());
    }
}
