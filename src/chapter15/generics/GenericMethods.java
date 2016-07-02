package chapter15.generics;

import utils.Generator;

/**
 * Created by Changjiang on 2016/07/01.
 * 范型方法
 */
class GenericMethodsWithOneNonGenericType{
    public <A,String,B> void f(A a,String integer,B b){
        System.out.println("A:"+a.getClass().getName()+",Integer:"+integer+",B:"+b.getClass().getName());
    }
}
class GenericMethodsTreeParams{
    public <A,B,C> void f(A a,B b,C c){
        System.out.println("A:"+a.getClass().getName()+",B:"+b.getClass().getName()+",C:"+c.getClass().getName());
    }
}
public class GenericMethods {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm=new GenericMethods();
        gm.f(" ");
        gm.f(1);
        gm.f(1.0);
        gm.f(1L);
        gm.f('c');
        gm.f(gm);
        GenericMethodsTreeParams genericMethodsTreeParams=new GenericMethodsTreeParams();
        genericMethodsTreeParams.f(" ",1,1L);
        GenericMethodsWithOneNonGenericType genericMethodsWithOneNonGenericType=new GenericMethodsWithOneNonGenericType();
        genericMethodsWithOneNonGenericType.f(" ",8,4L);
    }
}
