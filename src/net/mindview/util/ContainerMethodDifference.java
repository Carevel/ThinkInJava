package net.mindview.util;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by Changjiang on 2016/11/22.
 */
public class ContainerMethodDifference {
    static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<>();
        for (Method m : type.getMethods()) {
            result.add(m.getName());
        }
        return result;
    }
    static void interfaces(Class<?> type){
        System.out.println("Interfaces in "+type.getSimpleName()+" :");
        List<String> result=new ArrayList<>();
        for(Class<?> c :type.getInterfaces()){
            result.add(c.getSimpleName());
        }
        System.out.println(result);
        System.out.println("ContainerMethodDifference.interfaces");
    }

    public static void main(String[] args) {
        interfaces(Collection.class);
    }
}
