package chapter15.generics;

import utils.FourTuple;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/07/10.
 */
public class TurpleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args) {
        TurpleList<Vehicle,Amphibian,String,Integer> t1=new TurpleList<Vehicle, Amphibian, String,Integer>();
        t1.add(TupleTest.h());
        t1.add(TupleTest.h());
        for(FourTuple<Vehicle,Amphibian,String,Integer> i:t1){
            System.out.println(i);
        }
    }
}
