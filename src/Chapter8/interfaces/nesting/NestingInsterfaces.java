package Chapter8.interfaces.nesting;

/**
 * Created by Changjiang on 2015/6/29.
 */
class A{
    interface B{
        void f();
    }
    public class BImp implements B{
        @Override
        public void f() {

        }
    }
    private class BImp2 implements B{
        @Override
        public void f(){}
    }
    public interface C{
        void f();
    }
    class CImp implements C{
        public void f(){};
    }
    private class CImp2 implements C{
        public void f(){};
    }
    public interface D{
        void f();
    }
//    private interface D{
//        void f();
//    }
    private class DImp implements D{
        @Override
        public void f(){}
    }
    public class DImp2 implements D{
        @Override
        public void f(){}
    }
    public D getD(){
        return new DImp2();
    }
    public D dRef;
//    private D dRef;
    public void recievedD(D d){
        dRef=d;
        dRef.f();
    }
}
interface E{
    interface G{
        void f();
    }
    void g();
    //private interface H{}
}

public class NestingInsterfaces {
    public class BImp implements A.B{
        public void f(){};
    }
    class CImp implements A.C{
        public void f(){}
    }
    //类中的私有接口不能被实现
//    class DImp implements A.D{
//        void f(){}
//    }
    class EImp implements E{
        @Override
        public void g() {
        }
    }
    class GImp implements E.G{
        @Override
        public void f() {
        }
    }
    class EImp2 implements E{
        public void g(){}
        class EG implements E.G{
            public void f(){}
        }
    }

    public static void main(String[] args) {
        A a=new A();
        //私有域不能访问
        A.D aD=a.getD();
        //以下a.getD()所得的DImp2类会向上转型为D接口
       // A.DImp2 adimp2=a.getD();
        A.D ad=a.getD();
        A a2=new A();
        a2.recievedD(a.getD());
    }
}
