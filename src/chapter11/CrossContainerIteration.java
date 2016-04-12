package chapter11;

import java.util.*;

/**
 * Created by Changjiang on 2016/04/11.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p+",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = Pet.CreatePetFactory();
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS=new HashSet<Pet>(pets);
       // TreeSet<Pet> petsTS=new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
//        display(petsTS.iterator());

    }
}
