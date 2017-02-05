package net.mindview.util;

import java.util.*;

/**
 * Created by Changjiang on 2017/01/14.
 */
public class Contries {
    public static final String[][] DATA = {
            {"ALGERIA", "Algeria"}, {"ANGOLA", "Luanda"}
    };
    private static  class FlyweightMap extends AbstractMap<String,String>{
        @Override
        public Set<Map.Entry<String, String>> entrySet() {
            return null;
        }

        private static class  Entry implements Map.Entry<String,String> {
            int index;
            Entry(int index){
                this.index=index;
            }

            @Override
            public String getKey() {
                return DATA[index][0];
            }

            @Override
            public String getValue() {
                return DATA[index][1];
            }

            @Override
            public String setValue(String value) {
                throw  new UnsupportedOperationException();
            }

            @Override
            public boolean equals(Object obj) {
                return DATA[index][0].equals(obj);
            }
        }
    }
    static class EntrySet extends AbstractSet<String>{

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }
}
