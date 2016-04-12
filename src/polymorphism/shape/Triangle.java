package polymorphism.shape;

/**
 * Created by Changjiang on 2015/6/14.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangel.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangel.erase()");
    }
}
