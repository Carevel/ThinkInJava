package chapter13.strings.strings;

/**
 * Created by Changjiang on 2016/6/13.
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5276".matches("-?\\d+"));
        System.out.println("+011".matches("-?\\d+"));
        System.out.println("+011".matches("(-|\\+)?\\d+"));
    }
}
