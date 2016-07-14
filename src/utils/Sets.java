package utils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Changjiang on 2016/07/03.
 */
public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result=new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    public static <T> Set<T> innersection(Set<T> a,Set<T> b){
        Set<T> result=new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    public static <T> Set<T> diffrennce(Set<T> superSet,Set<T> subSet){
        Set<T> result=new HashSet<T>(superSet);
        result.removeAll(subSet);
        return result;
    }
    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return diffrennce(union(a,b),innersection(a,b));
    }
}
