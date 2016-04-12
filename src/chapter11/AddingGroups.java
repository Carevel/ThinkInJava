package chapter11;

import java.util.*;

/**
 * Created by Changjiang on 2016/04/06.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {7, 8, 9, 10};
        Collections.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11, 12);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(13, 14, 15);
        list.set(1, 17);
        //Arrays.asList 底层是数组实现
       // list.add(18); 此处添加元素会报错 UnsupportedOperationException
    }
}
