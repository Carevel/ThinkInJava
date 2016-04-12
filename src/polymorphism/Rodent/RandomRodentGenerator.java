package polymorphism.Rodent;

import java.util.Random;

/**
 * Created by Changjiang on 2015/6/14.
 */
public class RandomRodentGenerator {
    private static Random random=new Random(47);
    public Rodent next(){
        switch (random.nextInt(3)){
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Gerbil();
            case 2:
                return new Hamster();
        }
    }
}
