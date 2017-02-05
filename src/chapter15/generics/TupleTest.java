package chapter15.generics;

import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import utils.TwoTuple;

/**
 * Created by Changjiang on 2016/11/15.
 */
class Amphibian {
}

class Vehicle {
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTuple<>(new Vehicle(),new Amphibian(),"hi",47);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ts=f();
        System.out.println(ts);
    }
}
