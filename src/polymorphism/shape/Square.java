package polymorphism.shape;

/**
 * Created by Changjiang on 2015/6/14.
 */
public class Square extends Shape {
    @Override
    public void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }
}
