package chapter14.typeinfo;

/**
 * Created by Changjiang on 2016/6/19.
 */
class Candy{
    static {
        System.out.println("Loading Candy");
    }
}
class Gum{
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("Inside main");
        new Candy();
        System.out.println("After creating Candy");
        try{
            Class.forName("chapter14.typeinfo.Gum");
        }
        catch (ClassNotFoundException e){
            System.out.println("Coun`t find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After Creating Cookie");
    }
}
