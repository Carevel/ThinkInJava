package chapter15.generics.coffee;

/**
 * Created by Changjiang on 2016/11/30.
 */
class Building{}
class House extends Building{}
public class ClassTypeCapture <T>{
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind){
        this.kind=kind;
    }
    public  boolean f(Object arg){
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> classTypeCapture=new ClassTypeCapture<>(Building.class);
        System.out.println(classTypeCapture.f(new Building()));
        System.out.println(classTypeCapture.f(new House()));

        ClassTypeCapture<House> houseClassTypeCapture=new ClassTypeCapture<>(House.class);
        System.out.println(houseClassTypeCapture.f(new House()));
        System.out.println(houseClassTypeCapture.f(new Building()));
    }
}
