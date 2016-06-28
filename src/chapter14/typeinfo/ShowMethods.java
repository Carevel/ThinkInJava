package chapter14.typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by Changjiang on 2016/6/27.
 */
public class ShowMethods {
    private static String usage = "usage: ShowMethods qualified.class.name to show all methods in class or " +
            "ShowMethods qualified.class.name word to search from methods involving 'word' ";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher((method.toString())).replaceAll(""));
                }
                for(Constructor ctor:constructors){
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines=methods.length+constructors.length;
            }
            else{
                for(Method method:methods){
                    if(method.toString().indexOf(args[1])!=-1){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for(Constructor constructor:constructors){
                    if(constructor.toString().indexOf(args[1])!=-1){
                        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
