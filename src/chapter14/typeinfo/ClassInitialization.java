package chapter14.typeinfo;

import java.util.Random;

/**
 * Created by Changjiang on 2016/6/26.
 */
class Initable{
    static final int staticFinal=47;
    static final int staticFinal2=ClassInitialization.rnad.nextInt(1000);
    static {
        System.out.println("Initializiong Initable");
    }
}
class Initable2{
    static int staticFinal=147;
    static{
        System.out.println("Initializing Initable2");
    }
}
class Initable3{
    static int staticFinal=74;
    static{
        System.out.println("Initializing Initable3");
    }
}
//静态域分配的执行是在链接阶段，静态方法是在初始化阶段
public class ClassInitialization {
    public static Random rnad=new Random(47);
    public static void main(String[] args) throws ClassNotFoundException {
        Class initable=Initable.class;
        System.out.println("After creating Initalbe ref");
        //不触发初始化
        System.out.println(Initable.staticFinal);
        //触发初始化
        System.out.println(Initable.staticFinal2);
        //触发初始化
        System.out.println(Initable2.staticFinal);

        Class initable3=Class.forName("chapter14.typeinfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticFinal);
    }
}
