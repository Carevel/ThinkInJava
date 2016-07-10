package chapter15.generics;

import utils.FourTuple;
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
    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTuple<Vehicle,Amphibian, String, Integer>( new Vehicle(), new Amphibian(),"hi",47);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi=f();
        System.out.println(ttsi);
        System.out.println(h());
    }
}
