package chapter14.typeinfo;

/**
 * Created by Changjiang on 2016/6/26.
 */
public class BoundedClassreference {
    public static void main(String[] args) {
        //创建一个Class引用，并限定范围
        //它被限定为某种具体类型，或者该类型的任何子类型
        Class<? extends Number> bounded=int.class;
        bounded=double.class;
        bounded=Number.class;
    }
}
