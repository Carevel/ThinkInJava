package chapter15.generics.coffee;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Changjiang on 2016/11/17.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            count--;
            return count > 0;
        }

        @Override
        public Coffee next() {
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen=new CoffeeGenerator();
        for(int i=0;i<5;i++){
            System.out.println(gen.next());
        }
        for(Coffee c :new CoffeeGenerator(5)){
            System.out.println(c);
        }
    }
}
