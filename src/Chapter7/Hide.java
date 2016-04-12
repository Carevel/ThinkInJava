package Chapter7;

/**
 * Created by Changjiang on 2015/6/10.
 */
class Homer{
    char doh(char c){
        System.out.println("doh(char)");
        return c;
    }

    float doh(float f){
        System.out.println("doh(float)");
        return f;
    }
}
class Milhouse{}
class Bart extends Homer{
    float doh(float f){
        System.out.println("Milhouse()");
        return f;
    }
}
public class Hide {
    public static void main(String[] args){
        Bart bart=new Bart();
        bart.doh(1);
        bart.doh('c');
        bart.doh(2.0F);
    }
}
