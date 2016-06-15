package chapter14.typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Changjiang on 2016/6/14.
 */
abstract class Shape {
    void draw(){
        System.out.println(this+".drow()");
    }
     public abstract String toString();
}
class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}
class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}
class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle";
    }
}
public class Shapes{
    public static void main(String[] args) {
        List<Shape> shapeList= Arrays.asList(
                new Circle(),new Square(),new Triangle()
        );
        for(Shape shape:shapeList){
            shape.draw();
        }
    }
}
