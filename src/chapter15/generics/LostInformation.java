package chapter15.generics;

import java.util.*;

/**
 * Created by Changjiang on 2016/11/29.
 */
class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Partiacle<POSITION,MOMENTUM>{}
public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list=new ArrayList<>();
        Map<Frob,Fnorkle> map=new HashMap<>();
        Quark<Fnorkle> quark=new Quark<>();
        Partiacle<Long,Double> p=new Partiacle<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
    }
}
