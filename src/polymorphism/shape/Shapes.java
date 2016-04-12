package polymorphism.shape;

/**
 * Created by Changjiang on 2015/6/14.
 */
public class Shapes {
    private static RandomShapeGenerateor randomShapeGenerateor=new RandomShapeGenerateor();

    public static void main(String[] args) {
        Shape[] shapes=new Shape[9];
        for(int i=0;i<shapes.length;i++){
            shapes[i]=randomShapeGenerateor.next();
        }
        for(Shape shape :shapes){
            shape.draw();
        }
    }
}
