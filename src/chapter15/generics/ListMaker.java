package chapter15.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Changjiang on 2016/07/12.
 */
public class ListMaker<T> {
    List<T> create(){
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringListMaker=new ListMaker<String>();
        List<String> strings=stringListMaker.create();
        System.out.println(strings);
    }
}
