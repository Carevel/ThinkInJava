package chapter14.typeinfo;

/**
 * Created by Changjiang on 2016/6/26.
 */
public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass=int.class;
        Class<Integer> genericClass=int.class;
        genericClass=Integer.class;
        intClass=double.class;

        //以下不合法
        //genericClass=double.class;
    }
}
