package chapter15.generics.coffee;

import utils.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Changjiang on 2016/6/30.
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    private Class[] types={Americano.class,Breve.class,Cappuccino.class,Latte.class,Mocha.class};
    private static Random random=new Random(47);

    public CoffeeGenerator() {
    }
    private int size=0;
    public CoffeeGenerator(int size){
        this.size=size;
    }
    @Override
    public Coffee next() {

        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count=size;
        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {

        }

    }
    public Iterator<Coffee> iterator(){
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator generator=new CoffeeGenerator();
        for(int i=0;i<5;i++){
            System.out.println(generator.next());
        }
        for(Coffee c:new CoffeeGenerator(5)){
            System.out.println(c);
        }
    }
}
