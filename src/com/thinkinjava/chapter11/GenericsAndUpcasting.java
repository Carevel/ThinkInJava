package com.thinkinjava.chapter11;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/4/4.
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        apples.add(new Gala());
        for(Apple a :apples){
            System.out.println(a.id());
        }
    }
}
