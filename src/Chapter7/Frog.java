package Chapter7;

/**
 * Created by Changjiang on 2015/6/11.
 */
class Amphibian{

    public void say(){}
    public void breath(){}
    public void move(){}
    public static void set(Amphibian a){
        a.say();
    }
}
public class Frog extends Amphibian{
    public static final String S="s";
    public void say(){
        System.out.println("Frog.say()");
    }
    public static void main(String[] args){
        Frog frog=new Frog();
        Amphibian.set(frog);
        System.out.println(S);
    }
}
