package chapter15.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Changjiang on 2016/11/16.
 */
public class RandomList<T> {
    private ArrayList<T> storage=new ArrayList<T>();
    private Random random=new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> stringRandomList=new RandomList<>();
        for(String s:("The quick brown for jumped over the lazy").split(" "))
        {
            stringRandomList.add(s);
        }
        for(int i=0;i<11;i++){
            System.out.println(stringRandomList.select()+" ");
        }
    }
}
