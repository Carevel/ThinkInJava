package Chapter8.interfaces;

/**
 * Created by Changjiang on 2015/6/18.
 */
abstract class P{
    public abstract void print();
}
class P1 extends P{
    private int i=10;
    @Override
    public void print() {
        System.out.println(i);
    }
}
public class printTest {
    public static void main(String[] args) {
        P1 p1=new P1();
        p1.print();
    }
}
