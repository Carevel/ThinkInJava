package Chapter8.interfaces;

/**
 * Created by Changjiang on 2015/6/27.
 */
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharactoer {
    public void fight() {
    }
}

class Hero extends ActionCharactoer implements CanFight, CanSwim, CanFly, CanClimb {
    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void climb() {

    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanFly x) {
        x.fly();
    }

    public static void v(CanSwim x) {
        x.swim();
    }

    public static void l(CanClimb x) {
        x.climb();
    }

    public static void w(ActionCharactoer x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        l(h);
    }
}
