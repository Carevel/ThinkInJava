package Chapter7;

/**
 * Created by Changjiang on 2015/6/11.
 */
class Vallain{
    private String name;
    protected void set(String name){
        this.name=name;
    }
    public Vallain(String name){
        this.name=name;
    }
    public String toString(){
        return "I am a Vallain and my name is "+name;
    }
}
public class Orc extends Vallain{
    private int orcNumber;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber=orcNumber;
    }
    public void  change(String name,int orcNumber){
        super.set(name);
        this.orcNumber=orcNumber;
    }
    public String toString(){
        return "Orc "+orcNumber+":"+super.toString();
    }
    public static  void main(String[] args){
        Orc orc=new Orc("test",5);
        System.out.println(orc);
        orc.change("test1",6);
        System.out.println(orc);
    }
}
