package chapter15.generics;

/**
 * Created by Changjiang on 2016/11/29.
 */
class GenericBase<T> {
    private T element;

    public void setElement(T arg) {
        arg = element;
    }

    public T getElement() {
        return element;
    }
}
class Derived1<T> extends GenericBase<T>{}
class Derived2 extends GenericBase{}
public class ErasureAndInheritance {
    public static void main(String[] args) {
        Derived2 derived2=new Derived2();
        Object object=derived2.getElement();
        derived2.setElement(object);
    }
}
