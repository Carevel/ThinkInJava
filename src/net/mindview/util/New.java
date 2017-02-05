package net.mindview.util;

import utils.Pair;

import java.util.*;

/**
 * Created by Changjiang on 2016/11/21.
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }
    public static <T> List<T> list(){
        return new ArrayList<T>();
    }
    public static <T> LinkedList<T> iList(){
        return new LinkedList<T>();
    }
    public static <T> Set<T> set(){
        return new HashSet<T>();
    }
    public static <T> Queue<T> queue(){
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        Map<String,List<String>> sls=New.map();
        List<String> ls=New.list();
        LinkedList<String> lls=New.iList();
        Set<String> ss=New.set();
        Queue<String> qs=New.queue();
    }
}
