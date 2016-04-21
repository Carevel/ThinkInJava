package chapter11.holding;

import chapter11.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Changjiang on 2016/04/21.
 */
public class MapOfList {
    public static Map<Person,List<? extends Pet>> petPeople=new HashMap<Person, List<? extends Pet>>();
    static{
        petPeople.put(new Person("A"),Pet.CreatePetFactory());
        petPeople.put(new Person("B"),Pet.CreatePetFactory());
    }

    public static void main(String[] args) {
        System.out.println("People:"+petPeople.keySet());
        System.out.println("Pets:"+petPeople.values());
        for(Person person :petPeople.keySet()){
            System.out.println(person+" has ");
            for(Pet p:petPeople.get(person)){
                System.out.println(" "+p);
            }
        }
    }
}
