package Chapter8.interfaces;

/**
 * Created by Changjiang on 2015/6/29.
 * 工厂方法模式
 */
interface Service {
    void method1();

    void method2();
}

interface ServiceFcatory {
    Service getService();
}

class ImplA implements Service {
    @Override
    public void method1() {
        System.out.println("ImplA.method1");
    }

    @Override
    public void method2() {
        System.out.println("ImplA.method2");
    }
}

class ImplAFactory implements ServiceFcatory {
    @Override
    public Service getService() {
        return new ImplA();
    }
}

class ImplB implements Service {
    @Override
    public void method1() {
        System.out.println("ImplB.method1");
    }

    @Override
    public void method2() {
        System.out.println("ImplB.method2");
    }
}

class ImplBFactory implements ServiceFcatory {
    @Override
    public Service getService() {
        return new ImplB();
    }
}

class Factory<T> {
    @SuppressWarnings({"unchecked","rawtypes"})
    public T getInstanct(Class clazz) {
        try {
            return (T) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class Factories {
    public static void serviceCustomer(ServiceFcatory serviceFcatory) {
        Service service = serviceFcatory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        Factory<ImplA> factory=new Factory<ImplA>();
        factory.getInstanct(ImplA.class).method2();
        //serviceCustomer(new ImplBFactory());
        //serviceCustomer(new ImplAFactory());
    }
}
