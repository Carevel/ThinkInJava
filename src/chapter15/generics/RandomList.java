package chapter15.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Changjiang on 2016/6/29.
 */
public class RandomList<T> {
    private ArrayList<T> storage=new ArrayList<T>();
    public void add(T t){
        storage.add(t);
    }
    private Random rand=new Random(47);
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs=new RandomList<String>();
        for(String s:"a b c d f e g".split(" ")){
            rs.add(s);
        }
        for(int i=0;i<10;i++){
            System.out.println(rs.select());
        }
    }
}
