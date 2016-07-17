package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/14.
 */
public class SimpleHolder {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        SimpleHolder holder=new SimpleHolder();
        holder.setObject("Item");
        String s= (String) holder.getObject();
        System.out.println(s);
    }
}
