package Chapter7;

/**
 * Created by Changjiang on 2015/6/10.
 */
class Plate {
    Plate(int i) {
        System.out.println("Plate()");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate()");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil()");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Spoon()");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork()");
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Custom()");
    }
}

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork fk;
    private DinnerPlate dp;
    PlaceSetting(int i) {
        super(i);
        sp=new Spoon(i+1);
        fk=new Fork(i+2);
        dp=new DinnerPlate(i+3);
        System.out.println("PlaceSetting()");
    }
    public static void main(String[] args){
        PlaceSetting ps=new PlaceSetting(5);
    }
}
