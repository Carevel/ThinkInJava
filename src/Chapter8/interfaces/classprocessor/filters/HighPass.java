package Chapter8.interfaces.classprocessor.filters;

/**
 * Created by Changjiang on 2015/6/25.
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff=cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
