package chapter17.containers;

import utils.Generator;
import utils.MapData;
import utils.Pair;

import java.util.Iterator;

/**
 * Created by Changjiang on 2016/07/17.
 */
class Letters implements Generator<Pair<Integer,String>>,Iterable<Integer>{
    private int size=9;
    private int number=1;
    private char letter='A';

    @Override
    public Iterator<Integer> iterator() {
        return  new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number<size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {

            }
        };
    }

    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(number++," "+letter++);
    }
}
public class MapDataTest {
    public static void main(String[] args) {
        System.out.println(MapData.map(new Letters(),11));
    }
}
