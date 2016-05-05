package chapter11.holding;

import java.util.Iterator;

/**
 * Created by Changjiang on 2016/05/05.
 */
public class IteratorClass implements Iterable<String>{
    public static void main(String[] args) {
        for(String s :new IteratorClass()){
            System.out.println(s);
        }
    }
    protected String[] words=("and that is now").split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {

            }
        };
    }


}
