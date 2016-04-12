package Chapter8.interfaces.classprocessor.filters;

/**
 * Created by Changjiang on 2015/6/25.
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
