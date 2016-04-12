package Chapter8.interfaces.classprocessor.filters;

/**
 * Created by Changjiang on 2015/6/25.
 */

public class Waveform {
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return "Waveform "+id;
    }
}

