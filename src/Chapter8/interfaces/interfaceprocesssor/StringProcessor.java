package Chapter8.interfaces.interfaceprocesssor;

import java.util.Arrays;

/**
 * Created by Changjiang on 2015/6/26.
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s="If she weighs ths same as duck.";
    public static void main(String[] args) {
       Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
    }
}
class Upcase extends StringProcessor{
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends StringProcessor{
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor{
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(","));
    }
}
