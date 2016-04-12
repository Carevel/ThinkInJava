package Chapter8.interfaces.interfaceprocesssor;

/**
 * Created by Changjiang on 2015/6/26.
 */
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processor:"+p.name());
        System.out.println(p.process(s));
    }
}
