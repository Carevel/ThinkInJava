package Chapter8.interfaces;

import java.util.Random;

/**
 * Created by Changjiang on 2015/6/28.
 */
public interface RandVals {
    Random RANDOM =new Random(47);
    int RANDOM_INT= RANDOM.nextInt(10);
    long RANDOM_LONG= RANDOM.nextLong()*10;
    float RANDOM_FLOAT= RANDOM.nextFloat()*10;
    double RAND_DOUBLE= RANDOM.nextDouble()*10;
}

