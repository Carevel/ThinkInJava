package chapter11.holding;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Changjiang on 2016/04/14.
 */
public class StackGeneric<T> {
    private LinkedList<T> storage=new LinkedList<T>();
    public void push(T t){storage.addFirst(t);}
    public T peek(){return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    public String toString(){return storage.toString();}
}
