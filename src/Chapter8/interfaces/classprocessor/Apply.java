package Chapter8.interfaces.classprocessor;

import java.util.Arrays;

/**
 * Created by Changjiang on 2015/6/25.
 */
class Processer{
    public String name(){
        return this.getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}
class Upcase extends Processer{
    @Override
    Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}


class Downcase extends Processer{
    @Override
    Object process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processer{
    @Override
    Object process(Object input) {
        return Arrays.toString(((String)input).split(","));
    }
}
public class Apply {
    public static void process(Processer p,Object s){
        System.out.println("Using Processor "+p.name());
    }
    public static String s="A,b,c,1";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
