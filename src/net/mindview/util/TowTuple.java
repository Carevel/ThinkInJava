package net.mindview.util;

/**
 * Created by Changjiang on 2016/11/12.
 */
public class TowTuple<A, B> {
    public final A first;
    public final B second;

    public TowTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
