package polymorphism.music;

/**
 * Created by Changjiang on 2015/6/13.
 */
public class TestClass {
    private int itemI=0;  //itemI���ֶ�
    private static String itemS="����"; //itemS���ֶ�
    private final float PI=3.1415926F;  //PI���ֶ�
    //����������
    public TestClass(){
    }
    //getItemI����
    public int getItemI(){
        return this.itemI;
    }
    //getItemS����
    public static String getItemS(){
        return itemS;
    }
    //main������
    public static void main(String[] args) {
        TestClass ct=new TestClass();
    }
}




