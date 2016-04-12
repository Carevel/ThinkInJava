package Chapter10.innerclass;

/**
 * Created by Changjiang on 2015/7/1.
 * 内部类获取方法
 * 创建一个外部类的实例，然后通过外部类实例的方法返回内部类对象
 */
public class Outer {
    class Inner{
        public void f(){}
    }
    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner i=outer.getInner();
    }
}
