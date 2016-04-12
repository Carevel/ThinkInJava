package Chapter8.interfaces.classprocessor.filters;

/**
 * Created by Changjiang on 2015/6/25.
 */
public class Filter {
    public String name(){
        return this.getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
