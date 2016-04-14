package chapter11.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Changjiang on 2016/04/14.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rd=new Random(47);
        Set<Integer> insert=new HashSet<Integer>();
        for(int i=0;i<10000;i++){
            insert.add(rd.nextInt(30));
        }
        System.out.println(insert);
    }
}
