package chapter17.containers;

import utils.CollectionData;
import utils.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Changjiang on 2016/07/17.
 */
class Government implements Generator<String>{
    String[] foundation=("strange women lying in ponds" +
            "distributing swords is no basis for a system of " +
            "goverment").split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index];
    }
}
public class CollectionDataTest {
    public static void main(String[] args) {
        CollectionData<String> strings=new CollectionData<String>(new Government(),15);
        Set<String> set=new LinkedHashSet<String>(new CollectionData<String>(new Government(),15));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
    }
}
