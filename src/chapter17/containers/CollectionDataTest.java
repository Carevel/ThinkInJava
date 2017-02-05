package chapter17.containers;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Changjiang on 2016/12/04.
 */
class Goverment implements Generator<String>{
    String[] foundation=("Strange women lying in ponds distributing swards is no basis for a sysstem of goverment").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}
public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>(new CollectionData<String>(new Goverment(),15));
        set.addAll(CollectionData.list(new Goverment(),15));
        System.out.println(set);
    }
}
