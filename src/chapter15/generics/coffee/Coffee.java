package chapter15.generics.coffee;

/**
 * Created by Changjiang on 2016/6/30.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        //不能给final类型的变量赋值
        //coffee.id=5;
    }
}
