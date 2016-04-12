package Chapter7;

/**
 * Created by Changjiang on 2015/6/10.
 */
public class SpaceShip extends SpaceShipControls{
    private String name;
    public SpaceShip(String anme){}
    public String toString(){return name;}
    public static void main(String[] args){
        SpaceShip ss=new SpaceShip("NSA Ship");
        ss.forward(5);
    }
}
