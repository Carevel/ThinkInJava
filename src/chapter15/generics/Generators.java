package chapter15.generics;

import chapter15.generics.coffee.Coffee;
import chapter15.generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Changjiang on 2016/11/21.
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(generator.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c:coffee){
            System.out.println(c);
        }
        Collection<Integer> fnumbers=fill(new ArrayList<Integer>(),new Fibonacci(),12);
        for(Integer i:fnumbers){
            System.out.println(i);
        }
    }
}
