package Chapter7;

/**
 * Created by Changjiang on 2015/6/10.
 */
class Engine{
    public void start(){}
    public void stop(){}
    public void rev(){}
}

class Wheel{
    public void inflate(int psi){}
}
class Window{
    public void rollUp(){}
    public void rollDown(){}
}
class Door{
    public Window window=new Window();
    public void open(){}
    public void close(){}
}

public class Car {
    private Engine engine=new Engine();
    private Wheel wheel =new Wheel();
    private Door left=new Door(),right=new Door();
    public Car(){
        for(int i=0;i<4;i++){
            Wheel wheel=new Wheel();
        }
    }
    public static void main(String[] args){
        Car car =new Car();
        car.left.window.rollUp();
    }
}
