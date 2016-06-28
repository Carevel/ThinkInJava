package chapter15.generics;

/**
 * Created by Changjiang on 2016/6/28.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a=a;
    }
    public void set(T a){
        this.a=a;
    }
    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder3<AutoMobile> h3=new Holder3<AutoMobile>(new AutoMobile());
        AutoMobile a=h3.get();
        //h3.set("aaaa");
        //h3.set(1);
    }
}
