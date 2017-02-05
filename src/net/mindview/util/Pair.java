package net.mindview.util;

/**
 * Created by Changjiang on 2016/12/04.
 */
public class Pair<K,V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
