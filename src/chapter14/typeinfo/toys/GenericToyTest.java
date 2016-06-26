package chapter14.typeinfo.toys;

/**
 * Created by Changjiang on 2016/6/26.
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> fancyToyClass=FancyToy.class;
        FancyToy fancyToy=fancyToyClass.newInstance();
        Class<? super FancyToy> up=fancyToyClass.getSuperclass();
        Object obj=up.newInstance();
    }
}
