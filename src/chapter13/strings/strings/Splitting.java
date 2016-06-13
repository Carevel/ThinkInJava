package chapter13.strings.strings;

import java.util.Arrays;

/**
 * Created by Changjiang on 2016/6/13.
 */
public class Splitting {
    public static String knights="Then,when you have found the shrubbery,you must cut down the mightiest tree int the forest...";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\w+");
    }
}
