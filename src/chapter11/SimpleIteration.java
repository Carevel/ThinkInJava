package chapter11;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Changjiang on 2016/04/11.
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets=Pet.CreatePetFactory();
        Iterator<Pet> it=pets.iterator();
        while(it.hasNext()){
            Pet p=it.next();
            System.out.println(p);
        }
        for(Pet p:pets){
            System.out.println(p);
        }
        System.out.println(it);
        it=pets.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
    }
}
