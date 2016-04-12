package Chapter7;

/**
 * Created by Changjiang on 2015/6/11.
 */
class Gizmo{
    public void spin(){}
}
public class FinalArguments {
    void with(final Gizmo g){
        //g=new Gizmo();
    }
    void without(Gizmo g){
        g=new Gizmo();
    }
    public  static void main(String[] args){
        FinalArguments bf=new FinalArguments();
        bf.without(new Gizmo());
    }
}
