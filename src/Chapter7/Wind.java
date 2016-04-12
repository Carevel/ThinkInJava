package Chapter7;

import jdk.internal.org.objectweb.asm.commons.InstructionAdapter;

/**
 * Created by Changjiang on 2015/6/11.
 */
class Instrument{
    public void play(){}
    static void tune(Instrument i){
        i.play();
        System.out.println("i.play()");
    }
}
public class Wind extends Instrument {
    public static void main(String[] args){
        Wind wind=new Wind();
        Instrument.tune(wind);
    }
}
