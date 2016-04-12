package Chapter8.interfaces;

/**
 * Created by Changjiang on 2015/6/27.
 */
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBluud();
}
class VeryBadVampire implements Vampire{
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBluud() {

    }
}
public class HorrorShow {
    static void u(Monster m){m.menace();}
    static void v(DangerousMonster d){d.destroy();}
    static void w(Lethal l){
        l.kill();
    }
    public static void main(String[] args) {
        DangerousMonster d=new DragonZilla();
        u(d);
        v(d);
        Vampire vampire=new VeryBadVampire();
        w(vampire);
        u(vampire);
        v(vampire);
    }
}
