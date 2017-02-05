package chapter15.generics.coffee;

/**
 * Created by Changjiang on 2016/11/16.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String Coffee() {
        return getClass().getSimpleName() + " " + id;
    }
}
