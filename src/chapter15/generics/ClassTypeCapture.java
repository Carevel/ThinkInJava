package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/14.
 */
class Building{}
class House extends Building{}
public class ClassTypeCapture <T>{
    T x;
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind){
        this.kind=kind;
    }
    public boolean f(Object args){
        return kind.isInstance(args);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> classTypeCapture=new ClassTypeCapture<Building>(Building.class);
        System.out.println(classTypeCapture.f(new Building()));
        System.out.println(classTypeCapture.f(new House()));

        ClassTypeCapture<House> classTypeCapture1=new ClassTypeCapture<House>(House.class);
        System.out.println(classTypeCapture1.f(new Building()));
        System.out.println(classTypeCapture1.f(new House()));
    }
}
