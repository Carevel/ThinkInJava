package chapter15.generics;

/**
 * Created by Changjiang on 2016/11/30.
 */
public class SimpleHolder {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        SimpleHolder simpleHolder=new SimpleHolder();
        simpleHolder.setObj("item");
        String s= (String) simpleHolder.getObj();
    }
}
