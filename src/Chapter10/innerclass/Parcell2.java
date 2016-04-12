package Chapter10.innerclass;

/**
 * Created by Changjiang on 2015/7/1.
 * ÄÚ²¿Àà
 */
public class Parcell2 {
    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            this.label=whereTo;
        }
        String readLabel(){return this.label;}
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        Contents c=contents();
        Destination d=to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcell2 p=new Parcell2();
        p.ship("China");
        Parcell2 q=new Parcell2();
        Parcell2.Contents c=q.contents();
        Parcell2.Destination d=q.to("Borneo");
    }
}
