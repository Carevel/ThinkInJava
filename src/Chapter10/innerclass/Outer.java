package Chapter10.innerclass;

/**
 * Created by Changjiang on 2015/7/1.
 * �ڲ����ȡ����
 * ����һ���ⲿ���ʵ����Ȼ��ͨ���ⲿ��ʵ���ķ��������ڲ������
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
