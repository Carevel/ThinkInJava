package chapter15.generics;

import chapter14.typeinfo.FilledList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Changjiang on 2016/11/29.
 */
public class FilledListMaker<T> {
    List<T> create(T t, int n){
        List<T> result=new ArrayList<T>();
        for(int i=0;i<n;i++){
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringFilledListMaker=new FilledListMaker<>();
        List<String> list=stringFilledListMaker.create("Hello",5);
        System.out.println(list);
    }
}
