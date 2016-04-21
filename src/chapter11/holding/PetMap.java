package chapter11.holding;

import chapter11.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Changjiang on 2016/04/17.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, String> petMap=new HashMap<String, String>();
        petMap.put("A","A1");
        petMap.put("B","B1");
        petMap.put("C","C1");
        System.out.println(petMap);
        System.out.println(petMap.containsKey("A"));
        System.out.println(petMap.containsValue("C1"));
    }
}
