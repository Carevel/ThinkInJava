package Chapter8.interfaces.music5;

import polymorphism.music.Note;

import javax.xml.ws.soap.MTOMFeature;

/**
 * Created by Changjiang on 2015/6/18.
 */
abstract class Methods{
    public void play(Note note){
        System.out.println(this+".play()"+note);
    }
    public String toString(){
        return this.getClass().getName();
    }
    public void adjust(){
        System.out.println(this+".adjust()");
    }
}
interface Instrument{
    int VALUE=5;//static&final
    void adjust();
}
interface Playable{
    void play(Note note);
}
class Wind extends Methods implements Instrument,Playable{

}
class Percussion extends Methods implements Instrument,Playable{

}
class Stringed extends Methods implements Instrument,Playable {

}
class Brass extends Wind{
    @Override
    public String toString(){
        return "Brass";
    }
}
class Woodwind extends Wind{
    @Override
    public String toString(){
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Playable i){
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e){
        for(Playable i:e){
           tune(i);
        }
    }
    public static void main(String[] args) {
        Wind wind=new Wind();

        Playable[] Playable={new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
        tuneAll(Playable);
    }
}
