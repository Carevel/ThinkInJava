package chapter14.typeinfo;

/**
 * Created by Changjiang on 2016/6/26.
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        //通配符
        Class<?> intClass=int.class;
        intClass=double.class;
    }
}
