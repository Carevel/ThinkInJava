package chapter13.strings.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by Changjiang on 2016/6/14.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input="This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
    }
}
