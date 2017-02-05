package net.mindview.util;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/12/04.
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int initialCapacity) {
        for (int i = 0; i < initialCapacity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}
