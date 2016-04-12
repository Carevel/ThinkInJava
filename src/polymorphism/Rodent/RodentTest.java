package polymorphism.Rodent;

/**
 * Created by Changjiang on 2015/6/14.
 */
public class RodentTest {
    private static RandomRodentGenerator randomRodentGenerator=new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        for(int i=0;i<rodents.length;i++){
            rodents[i]=randomRodentGenerator.next();
        }
        for(Rodent rodent:rodents){
            rodent.move();
        }
    }
}
