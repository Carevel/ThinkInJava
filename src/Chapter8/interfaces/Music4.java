package Chapter8.interfaces;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.paint.Stop;
import polymorphism.music.Note;

import javax.swing.text.StyledEditorKit;
import java.nio.channels.ClosedSelectorException;

/**
 * Created by Changjiang on 2015/6/18.
 */
abstract class Instrument {
    private int i;

    public abstract void play(Note note);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }

    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play()" + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
    }
}

class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play()" + note);
    }

    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play()" + note);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] instruments = {new Wind(), new Percussion(), new Woodwind(), new Brass()};
        tuneAll(instruments);
    }
}
