package Chapter10.innerclass;

/**
 * Created by Changjiang on 2015/7/1.
 */
public class Parcell {
    class Contents{
        private int i=11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            this.label=whereTo;
        }
        String readLable(){
            return this.label;
        }
    }
    public void ship(String dest){
        Contents c=new Contents();
        Destination d=new Destination(dest);
        System.out.println(d.readLable());
    }

    public static void main(String[] args) {
        Parcell p=new Parcell();
        p.ship("China");
       // Parcell.Contents c=new Parcell.Contents();
    }
}
