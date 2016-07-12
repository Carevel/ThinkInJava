package chapter15.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Changjiang on 2016/07/12.
 */
public class FilledListMaker<T> {
    List<T> create(T t,int n){
        List<T> result=new ArrayList<T>();
        for(int i=0;i<n;i++){
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> filledListMaker=new FilledListMaker<String>();
        List<String> list=filledListMaker.create("Hello",5);
        System.out.println(list);
    }

}
