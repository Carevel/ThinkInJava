package chapter17.containers;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Changjiang on 2017/01/15.
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("---" + msg + "---");
        Collection<String> c = list;
        Collection<String> sublist = list.subList(1, 8);
        Collection<String> c2=new ArrayList<>(sublist);
        try{
            c.retainAll(c2);
        }
        catch (Exception e){
            System.out.println("retainAll(): "+e);
        }
        try{
            c.removeAll(c2);
        }
        catch (Exception e){
            System.out.println("removeAll():"+e);
        }
        try{
            c.add("X");
        }
        catch (Exception e){
            System.out.println("add() :"+e);
        }
        try{
            c.addAll(c2);
        }
        catch (Exception e){
            System.out.println("addAll() :"+e);
        }
        try{
            c.remove("C");
        }
        catch (Exception e){
            System.out.println("remove() :"+e);
        }
        try{
            list.set(0,"X");
        }
        catch (Exception e){
            System.out.println("List.set():"+e);
        }
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("A B C D E F G H I J K L M N".split(" "));
        test("Modeifiable Copy ",new ArrayList<>(list));
    }
}
