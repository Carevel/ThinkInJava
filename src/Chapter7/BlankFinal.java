package Chapter7;

/**
 * Created by Changjiang on 2015/6/11.
 */
class Poppet{
    private  int i;
    Poppet(int i){
        this.i=i;
    }
}

public class BlankFinal {
    private final int i=0;
    private final int j;
    private final Poppet poppet;
    BlankFinal(int x){
        j=x;
        poppet=new Poppet(1);
    }
    BlankFinal(){
        j=1;
        poppet=new Poppet(1);
    }
    public static void main(String[] args){
        new BlankFinal();
        new BlankFinal(4);
    }
}
