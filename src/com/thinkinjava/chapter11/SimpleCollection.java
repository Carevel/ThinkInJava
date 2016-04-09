package com.thinkinjava.chapter11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Changjiang on 2016/4/4.
 */
public class SimpleCollection {
    int i;
    Integer b;
    public static void main(String[] args) {
        SimpleCollection sc=new SimpleCollection();
        Collection<Integer> c=new ArrayList<>();
        for(int i=0;i<10;i++){
            c.add(i);//自动装箱
        }
        for(Integer i:c){
            System.out.print(i+",");
        }
    }
}
