package polymorphism.music;

/**
 * Created by Changjiang on 2015/6/12.
 */
class Father{
   public void f1(){
       System.out.println("Father.f1()");
   }
    public void f1(char c){
        System.out.println("Father.f1(char)");
    }
}
public class Son extends Father{
    @Override
    public void f1(){
        System.out.println("Son.f1()");
    }
    public  static void main(String[] args){
        Father father=new Son();
        father.f1();
    }
}
