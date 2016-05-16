package chapter13.strings;

/**
 * Created by Changjiang on 2016/05/16.
 */
public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q="aa";
        System.out.println(upcase(q));
    }
}
