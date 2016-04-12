package Chapter8.interfaces.classprocessor.filters;

/**
 * Created by Changjiang on 2015/6/25.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff=cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
