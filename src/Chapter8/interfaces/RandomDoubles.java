package Chapter8.interfaces;

import java.util.Random;

/**
 * Created by Changjiang on 2015/6/28.
 */
public class RandomDoubles {
    private static Random random=new Random(47);
    public double next(){return random.nextDouble();}

    public static void main(String[] args) {
        RandomDoubles randomDoubles=new RandomDoubles();
        for(int i=0;i<7;i++){
            System.out.println(randomDoubles.next() + " ");
        }
    }
}
