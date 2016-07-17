package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/14.
 */
public class GenericHolder<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> genericHolder=new GenericHolder<String>();
        genericHolder.setObj("Item");
        System.out.println(genericHolder.getObj());
    }
}
