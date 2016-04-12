package chapter11;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/1/21.
 */
public class ApplesAndOrangesWithGeneric {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
        for(Apple apple: apples){
            System.out.println(apple.id());
        }
    }
}
