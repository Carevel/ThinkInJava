package chapter15.generics;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Changjiang on 2016/12/03.
 */
interface HasColor {
    String getColor();
}

class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    String color() {
        return item.getColor();
    }
}

public class BasicBounds {
    LinkedList<String> linkedList=new LinkedList<>();
}
