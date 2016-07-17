package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/14.
 */
class ClassAsFactory<T>{
    T x;
    public ClassAsFactory(Class<T> kind){
        try {
            x=kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class Employee{}
public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe=new ClassAsFactory<Employee>(Employee.class);
        System.out.println(fe.x);
        try{
            ClassAsFactory<Integer> fi=new ClassAsFactory<Integer>(Integer.class);
        }
        catch (Exception e){
            System.out.println("ClassAsFactory<Integer> failed");
        }
    }
}
