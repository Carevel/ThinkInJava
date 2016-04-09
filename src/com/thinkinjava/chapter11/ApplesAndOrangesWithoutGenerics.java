package com.thinkinjava.chapter11;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/4/4.
 */
class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(((Apple) apples.get(i)).id());
            //Orange只在运行时才被检查到
        }
    }
}