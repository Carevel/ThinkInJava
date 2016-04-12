package polymorphism.music;

/**
 * Created by Changjiang on 2015/6/12.
 */
class Stringed extends Instrument{
    @Override
    public void play(Note note){
        System.out.println("Stringed.play()"+note);
    }
}
class Brass extends Instrument{
    @Override
    public void play(Note note){
        System.out.println("Brass.play()"+note);
    }
}

public class Music2  {
    public static void tune(Wind wind){
        wind.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed stringed){
        stringed.play(Note.MIDDLE_C);
    }
    public static void tune(Brass brass){
        brass.play(Note.MIDDLE_C);
    }
    public static void main(String[] args){
        Wind wind=new Wind();
        Stringed stringed=new Stringed();
        Brass brass=new Brass();
        tune(wind);
        tune(stringed);
        tune(brass);
    }
}
