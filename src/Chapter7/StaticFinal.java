package Chapter7;

/**
 * Created by Changjiang on 2015/6/11.
 */
class SelfCounter {
    private static int counter;
    private int id = counter++;

    public String toString() {
        return "id:" + id;
    }
}

class WithFinalFields {
    final SelfCounter selfCounter = new SelfCounter();
    static SelfCounter selfCounter2 = new SelfCounter();

    public String toString() {
        return "selfCounter:" + selfCounter.toString() + "\nselfCounter2:" + selfCounter2.toString();
    }
}

public class StaticFinal {
    public static void main(String[] args) {
        System.out.println("WithFinalFields:");
        System.out.println(new WithFinalFields());
        System.out.println("WithFinalFields2:");
        System.out.println(new WithFinalFields());
    }

}
