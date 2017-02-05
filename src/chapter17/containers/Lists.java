package chapter17.containers;

import java.util.*;

/**
 * Created by Changjiang on 2017/01/17.
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;
    public static void basicTest(List<String> a){
        a.add(1,"x");
        a.add("x");
        a.addAll(Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N".split(",")));
        a.addAll(Arrays.asList("O,P,Q".split(",")));
        a.addAll(3,Arrays.asList("R,S,T".split(",")));
        b=a.contains("x");
        b=a.containsAll(Arrays.asList("O,P,Q".split(",")));
        s=a.get(1);
        i =a.indexOf("x");
        it=a.iterator();
        lit=a.listIterator();
        lit=a.listIterator(3);
        i=a.lastIndexOf("x");
        a.remove(1);
        a.remove("B");
        a.set(1,"Y");
        a.retainAll(Arrays.asList("C,D,E,F".split(",")));
        a.removeAll(Arrays.asList("H,J,K".split(",")));
        i=a.size();
        a.clear();
    }
    public static void iterMotion(List<String> a){
        ListIterator<String> it=a.listIterator();
        b=it.hasNext();
        b=it.hasPrevious();
        s=it.next();
        i=it.nextIndex();
        s=it.previous();
        i=it.previousIndex();
    }
    public static void iterManipulation(List<String> a){
        ListIterator<String> stringListIterator=a.listIterator();
        stringListIterator.add("x");
        stringListIterator.next();
        stringListIterator.remove();
        stringListIterator.next();
        stringListIterator.set("47");
    }

    public static void main(String[] args) {
        basicTest(new LinkedList<>(Arrays.asList("A,B,C,D".split(","))));
        basicTest(new ArrayList(Arrays.asList("D,E,F,G".split(","))));
        iterMotion(new LinkedList<String>(Arrays.asList("A,B,C".split(","))));
        iterManipulation(new LinkedList<>(Arrays.asList("A,B,C,D".split(","))));
    }
}
