package chapter15.generics;

/**
 * Created by Changjiang on 2016/12/01.
 */
class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> classAsFactory = new ClassAsFactory<>(Employee.class);
        ClassAsFactory<Integer> integerClassAsFactory=new ClassAsFactory<>(Integer.class);
    }
}
