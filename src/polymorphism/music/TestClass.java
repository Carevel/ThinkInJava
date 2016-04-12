package polymorphism.music;

/**
 * Created by Changjiang on 2015/6/13.
 */
public class TestClass {
    private int itemI=0;  //itemI类字段
    private static String itemS="我们"; //itemS类字段
    private final float PI=3.1415926F;  //PI类字段
    //构造器方法
    public TestClass(){
    }
    //getItemI方法
    public int getItemI(){
        return this.itemI;
    }
    //getItemS方法
    public static String getItemS(){
        return itemS;
    }
    //main主方法
    public static void main(String[] args) {
        TestClass ct=new TestClass();
    }
}




