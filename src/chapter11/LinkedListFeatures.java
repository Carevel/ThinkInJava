package chapter11;

import java.util.LinkedList;

/**
 * Created by Changjiang on 2016/04/13.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets=new LinkedList<Pet>(Pet.CreatePetFactory());
        System.out.println(pets);
        System.out.println("pets.getFirst():"+pets.getFirst());
        System.out.println("pets.element():"+pets.element());
        System.out.println("pets.peek()"+pets.peek());
        System.out.println(pets);
        //remove()方法移除并返回第一个元素
        System.out.println("pets.remove():"+pets.remove());
        System.out.println(pets);
        System.out.println("pets.poll():"+pets.poll());
        System.out.println(pets);
        pets.addFirst(new Cat());
        System.out.println("after addFirst():"+pets);
        pets.offer((pets.getFirst()));
        System.out.println(pets);
        pets.addLast(new Snag());
        System.out.println("after addLast():"+pets);
    }
}

