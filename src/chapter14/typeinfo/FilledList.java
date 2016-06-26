package chapter14.typeinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Changjiang on 2016/6/26.
 */
class CounterInteger{
    private static long counter;
    private final long id=counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}
public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElement) {
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElement; i++) {
                result.add(type.newInstance());
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CounterInteger> fl=new FilledList<CounterInteger>(CounterInteger.class);
        System.out.println(fl.create(15));
    }
}
