package chapter11;

import com.sun.deploy.security.MozillaMyKeyStore;

import java.util.*;

/**
 * Created by Changjiang on 2016/04/07.
 */

public class Pet {
    public static List<Pet> CreatePetFactory() {
        List<Pet> list = new ArrayList<Pet>();
        Random r1 = new Random();
        for (int i = 0; i < 5; i++) {
            switch (r1.nextInt(5)) {
                case 4:
                    list.add(new Cat());
                    break;
                case 3:
                    list.add(new Dog());
                    break;
                case 2:
                    list.add(new Monkey());
                    break;
                case 1:
                    list.add(new Bird());
                    break;
                default:
                    list.add(new Snag());
                    break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Pet> pets = CreatePetFactory();
        System.out.println("1:" + pets);
        Ret ret = new Ret();
        pets.add(ret);
        System.out.println("2:" + pets);
        System.out.println("3:" + pets.contains(ret));
        pets.remove(ret);
        Pet p = pets.get(2);
        System.out.println("4:" + p + " " + pets.indexOf(p));
        System.out.println("5:" + pets.get(0));
        Dog dog = new Dog();
        System.out.println("6:" + pets.indexOf(dog));
        System.out.println("7:" + pets.remove(dog));
        System.out.println("8:" + pets.remove(p));
        System.out.println("9:" + pets);
        pets.add(3, new Monkey());
        System.out.println("10:" + pets);
        List<Pet> sub = pets.subList(1, 3);
        System.out.println("sublist:" + sub);
        System.out.println(pets.containsAll(sub));
        // Collections.sort(sub);
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println(sub);
        copy.retainAll(sub);
        System.out.println("13:"+copy);
        copy=new ArrayList<Pet>(pets);
        copy.remove(2);
        System.out.println("14:"+copy);
        pets.clear();
        System.out.println(pets);

    }
}

class Cat extends Pet {
    Cat() {
        toString();
    }

    @Override
    public String toString() {
        return "Cat";
    }
}

class Dog extends Pet {
    @Override
    public String toString() {
        return "Dog";
    }
}

class Bird extends Pet {
    @Override
    public String toString() {
        return "Bird";
    }
}

class Monkey extends Pet {
    @Override
    public String toString() {
        return "Monkey";
    }
}

class Snag extends Pet {
    @Override
    public String toString() {
        return "Snag";
    }
}

class Ret extends Pet {
    @Override
    public String toString() {
        return "Ret";
    }
}

class Cymric extends Pet {
    @Override
    public String toString() {
        return "Cymric";
    }
}
