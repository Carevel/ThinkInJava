package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Changjiang on 2016/1/23.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.println(i);
        }

        //Set  不重复的
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<3;i++){
            set.add(i);
        }
        for(Integer i :set){
            System.out.println(i);
        }
    }
}
