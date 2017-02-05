package net.mindview.util;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * Created by Changjiang on 2016/12/05.
 */
public class MapData<K,V> extends LinkedHashMap<K,V> {
    public MapData(Generator<Pair<K,V>> gen,int quanlity){
        for(int i=0;i<quanlity;i++){
            Pair<K,V> pair=gen.next();
            put(pair.key,pair.value);
        }
    }
    public MapData(Generator<K> gen,Generator<V> genV,int quanlity){
        for(int i=0;i<quanlity;i++){
            put(gen.next(),genV.next());
        }
    }
    public MapData(Generator<K> genK,V value,int quanlity){
        for(int i=0;i<quanlity;i++){
            put(genK.next(),value);
        }
    }

    public MapData(Iterable<K> genK,Generator<V> genV){
        for(K k : genK){
            put(k,genV.next());
        }
    }
    public MapData(Iterable<K> genK,V value){
        for(K k:genK){
            put(k,value);
        }
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK,Generator<V> genV,int quanlity){
        return new MapData<K, V>(genK,genV,quanlity);
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK,V value,int quanlity){
        return  new MapData<K, V>(genK,value,quanlity);
    }
    public static <K,V> MapData<K,V> map(Iterable<K>  genK,Generator<V> genV){
        return new MapData<K, V>(genK,genV);
    }
    public static <K,V> MapData<K,V> map(Iterable<K> genK,V value){
        return  new MapData<K, V>(genK,value);
    }
}
