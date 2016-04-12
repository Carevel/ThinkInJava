package polymorphism.music;

/**
 * Created by Changjiang on 2015/6/12.
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n){
        System.out.println("Wind.play()");
    }

}
