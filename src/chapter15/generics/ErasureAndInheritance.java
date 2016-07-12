package chapter15.generics;

/**
 * Created by Changjiang on 2016/07/11.
 */

/**
 * 擦除和继承
 * @param <T>
 */
class GenericBase<T>{
    private T element;

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
class Derived1<T> extends GenericBase<T>{}
class Derivied2 extends GenericBase{}
public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derivied2 d2=new Derivied2();
        Object obj=d2.getElement();
        d2.setElement(obj);
    }
}
