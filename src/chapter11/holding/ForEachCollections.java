package chapter11.holding;

import javafx.print.Collation;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Changjiang on 2016/05/05.
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> s = new LinkedList<String>();
        Collections.addAll(s, "take me to your heart".split(" "));
        for(String str:s){
            System.out.println(str);
        }
    }
}
