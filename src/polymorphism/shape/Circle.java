package polymorphism.shape;

/**
 * Created by Changjiang on 2015/6/14.
 */
public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    }

    @Override
    public void say() {
       System.out.println("Circle.say()");
    }
}
