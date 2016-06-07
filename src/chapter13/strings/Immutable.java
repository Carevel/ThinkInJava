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
        String q1=upcase(q);
        String qq=upcase(q);
        System.out.println(qq);;
        System.out.println(qq==q);
        System.out.println(q1.equals(qq));
        System.out.println(qq.equals(q));
    }
}
