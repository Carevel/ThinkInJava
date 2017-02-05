package net.mindview.util;

/**
 * Created by Changjiang on 2016/11/15.
 */
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    private final D fourth;

    public FourTuple(A first, B second, C third, D fourth) {
        super(first, second, third);
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + ")";
    }
}
