package chapter15.generics;

import chapter15.generics.coffee.Coffee;
import chapter15.generics.coffee.CoffeeGenerator;
import utils.Generator;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Changjiang on 2016/07/01.
 * 利用生成器填充Collection
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n){
        for(int i=0;i<n;i++){
            collection.add(generator.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees=fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee c:coffees){
            System.out.println(c);
        }
        Collection<Integer> fnumbers=fill(new ArrayList<Integer>(),new Fibonacci(),12);
        for(int i:fnumbers){
            System.out.print(i+",");
        }
    }
}
