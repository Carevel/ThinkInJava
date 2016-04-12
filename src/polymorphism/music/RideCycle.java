package polymorphism.music;

/**
 * Created by Changjiang on 2015/6/12.
 */
class Cycle{
    public  void ride(){
    }
}
class Unicycle extends Cycle{
    @Override
    public void ride(){}
}
class Bicycle extends Cycle{
    @Override
    public void ride(){}
}
class Tricycle extends Cycle{
    @Override
    public void ride(){}
}
public class RideCycle {
    public static void ride(Cycle cycle){
        System.out.println(cycle);
    }
    public static void main(String[] args){
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }
}
