package chapter11;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Changjiang on 2016/04/12.
 */
public class ListIteratoion {
    public static void main(String[] args) {
        List<Pet> pets=Pet.CreatePetFactory();
        ListIterator<Pet> it=pets.listIterator();
        while(it.hasNext()){
            System.out.print(it.next()+","+it.nextIndex()+","+it.previousIndex()+";");
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.print(it.previous()+","+it.previousIndex()+";");
        }
        System.out.println();
        System.out.println(pets);
        it=pets.listIterator(3);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
