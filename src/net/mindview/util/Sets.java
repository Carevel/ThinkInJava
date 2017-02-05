package net.mindview.util;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Changjiang on 2016/11/21.
 */
public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T> differenent(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.removeAll(b);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return differenent(union(a, b), intersection(a, b));
    }
}
