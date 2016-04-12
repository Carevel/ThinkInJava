package chapter11;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/1/22.
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
public class GenericAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        for(Apple apple : apples){
            System.out.println(apple);
        }
    }
}
