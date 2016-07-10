package chapter15.generics;

import utils.Generator;

/**
 * Created by Changjiang on 2016/07/03.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountObject> countObjectBasicGenerator=BasicGenerator.Create(CountObject.class);
        Generator<CountObject> countObjectGenerator=new BasicGenerator<CountObject>(CountObject.class);
        for(int i=0;i<5;i++){
            System.out.println(countObjectBasicGenerator.next());
            System.out.println(countObjectGenerator.next());
        }
    }
}
