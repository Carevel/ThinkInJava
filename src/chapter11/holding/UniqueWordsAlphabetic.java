package chapter11.holding;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Changjiang on 2016/04/16.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> word=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        Collections.addAll(word,"A,E,D,eb,ca,c".split(","));
        System.out.println(word);
    }
}
