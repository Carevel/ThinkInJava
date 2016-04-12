package polymorphism;

/**
 * Created by Changjiang on 2015/6/14.
 */
class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}
class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}
class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}
class Lanch extends Meal{
    Lanch(){
         System.out.println("Lanch()");
    }
}
class PortableLunch extends Lanch{
    PortableLunch(){
        System.out.println("PortableLanch()");
    }
}
public class SandSwitch extends PortableLunch {
    private Bread bread=new Bread();
    private Cheese cheese=new Cheese();
    private Lettuce lettuce=new Lettuce();
    public SandSwitch(){
        System.out.println("SandSwitch()");
    }

    public static void main(String[] args) {
        new SandSwitch();
    }
}
