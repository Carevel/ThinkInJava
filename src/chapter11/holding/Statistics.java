package chapter11.holding;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Changjiang on 2016/04/16.
 */
public class Statistics {
    public static void main(String[] args) {
        Random random=new Random(47);
        Map<Integer,Integer>  m=new HashMap<Integer, Integer>();
        for(int i=0;i<10;i++){
            int r=random.nextInt(20);
            Integer freq=m.get(r);
            m.put(r,freq==null?1:freq+1);
        }
        System.out.println(m);
    }
}
