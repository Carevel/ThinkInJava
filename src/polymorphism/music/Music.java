package polymorphism.music;

/**
 * Created by Changjiang on 2015/6/12.
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public  static void main(String[] args){
        Wind wind=new Wind();
        tune(wind);
    }
}
