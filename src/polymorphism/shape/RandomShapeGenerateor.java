package polymorphism.shape;

import java.util.Random;

/**
 * Created by Changjiang on 2015/6/14.
 */

public class RandomShapeGenerateor {
        private Random random=new Random(47);
        public Shape next(){
            switch (random.nextInt(3)){
                default:
                case 0:
                    return new Circle();
                case 1:
                    return new Square();
                case 2:
                    return new Triangle();
            }
        }
}
