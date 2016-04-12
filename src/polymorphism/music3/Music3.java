package polymorphism.music3;

import polymorphism.music.Note;

import java.util.Random;

/**
 * Created by Changjiang on 2015/6/14.
 */
class Instrument{
    void play(Note note){
        System.out.println("Instrument.play() "+note);
    }
    String what(){
        return this.toString();
    }
    void adjust(){
        System.out.println("Adjusting Instrument.");
    }
}
class Wind extends Instrument{
    @Override
    void play(Note note) {
        System.out.println("Wind.play() "+note);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind.");
    }
}
class Percussion extends Instrument{
    @Override
    void play(Note note) {
        System.out.println("Percussion.paly() "+note);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion.");
    }
}
class Stringed extends Instrument{
    @Override
    void play(Note note) {
        System.out.println("Stringed.play() "+note);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed.");
    }
}
class RandomMusicGenerator{
    private static Random rd=new Random(47);
    public Instrument next(){
        switch (rd.nextInt(3)){
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
        }
    }
}
public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] instruments){
        for(Instrument i:instruments){
            i.play(Note.MIDDLE_C);
        }
    }
    public static void main(String[] args) {
        Instrument[] instruments={new Wind(),new Percussion(),new Stringed()};
        tuneAll(instruments);
        Instrument instrument=new Instrument();
        System.out.println(instrument);
        Instrument[] instruments1=new Instrument[3];
        RandomMusicGenerator randomMusicGenerator=new RandomMusicGenerator();
        for(int i=0;i< instruments1.length;i++){
            instruments1[i]=randomMusicGenerator.next();
        }
        for(Instrument i:instruments1){
            i.play(Note.MIDDLE_C);
        }
    }
}
