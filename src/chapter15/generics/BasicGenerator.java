package chapter15.generics;

import utils.Generator;

/**
 * Created by Changjiang on 2016/07/03.
 */

/**
 *
 * @param <T>
 */
public class BasicGenerator<T> implements Generator<T> {
    public BasicGenerator(){}
    private Class<T> type;
    public BasicGenerator(Class<T> type){
        this.type=type;
    }
    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static <T> Generator<T> Create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
