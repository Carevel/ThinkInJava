package chapter15.generics;

import chapter13.strings.strings.IntegerMatch;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/11/28.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1=new ArrayList<String>().getClass();
        Class c2=new ArrayList<Integer>().getClass();
        System.out.println(c1==c2);
    }
}
