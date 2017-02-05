package net.mindview.util;

/**
 * Created by Changjiang on 2016/11/15.
 */
public class ThreeTuple<A, B, C> extends TowTuple<A, B> {
    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }
}
