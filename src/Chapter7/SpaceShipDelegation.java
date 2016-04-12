package Chapter7;

/**
 * Created by Changjiang on 2015/6/10.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls spaceShipControls =new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name=name;
    }
    //delegated methods
    public void back(int velocity){
        spaceShipControls.back(velocity);
    }
    public void down(int velocity){
        spaceShipControls.down(velocity);
    }
    public void forward(int velocity){
        spaceShipControls.forward(velocity);
    }
    public void left(int velocity){
        spaceShipControls.left(velocity);
    }
    public void right(int velocity){
        spaceShipControls.right(velocity);
    }
    public void turboBoost(){
        spaceShipControls.turboBoost();
    }
    public void up(int velocity){
        spaceShipControls.up(velocity);
    }
    public static void main(String[] args){
        SpaceShipDelegation spaceShipDelegation=new SpaceShipDelegation("NSA");
        spaceShipDelegation.down(2);
    }
}
