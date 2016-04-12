package chapter11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Changjiang on 2016/04/06.
 */
class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1= Arrays.asList(new Crusty(),new Slush(),new Power());
        List<Power> snow2=Arrays.asList(new Light(),new Heavy());
        //编译不通过
        //List<Snow> snow3= Arrays.asList(new Light(),new Heavy());
        List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
