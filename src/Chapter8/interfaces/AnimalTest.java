package Chapter8.interfaces;

import com.sun.deploy.perf.PerfRollup;

import java.util.Scanner;

/**
 * Created by Changjiang on 2015/6/27.
 */
interface CanSay{
    void move();
    void say();
}
interface CanMove{
    void up();
    void down();
}
interface CanGet{
    void left();
    void right();
}
interface Whole extends CanSay,CanMove,CanGet{
    void todo();
}
abstract class Person2{
    abstract void still();
}
class Person{

}
class People extends Person2 implements Whole{
    @Override
    public void move(){}
    @Override
    public void say(){}
    @Override
    public void up(){}
    @Override
    public void down(){}
    @Override
    public void left(){}
    @Override
    public void right(){}


    @Override
    void still() {

    }

    @Override
    public void todo() {

    }
}
public class AnimalTest {
    public static void a(CanSay c){c.say();c.move();}
    public static void b(CanMove c){c.down();c.up();}
    public static void c(CanGet c){c.left();c.right();}
    public static void d(Whole c){c.todo();c.say();c.move();c.down();c.up();c.left();c.right();}

    public static void main(String[] args) {
        People people=new People();
        a(people);
        b(people); 
        c(people);
        d(people);
    }
}
