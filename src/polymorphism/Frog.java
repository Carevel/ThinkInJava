package polymorphism;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by Changjiang on 2015/6/14.
 */
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("Creating Characteristic "+s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic");
    }
}
class Description{
    private String s;
    Description(String s){
        this.s=s;
        System.out.println("Creating Description "+s);
    }
    protected void dispose(){
        System.out.println("disposing Description");
    }
}
class LivingCraeture{
    private Characteristic characteristic=new Characteristic("is alive");
    private Description description=new Description("Base Living Creature");
    LivingCraeture(){
        System.out.println("LivingCreature()");
    }

    protected  void dispose(){
        System.out.println("LivingCreature dispose");
        characteristic.dispose();
        description.dispose();
    }
}
class Animal extends LivingCraeture{
    private Characteristic characteristic=new Characteristic("has heart");
    private Description description=new Description("Animal not vegetable");
    Animal(){
        System.out.println("Animal");
    }

    @Override
    protected void dispose() {
        System.out.println("Animal dispose");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }
}

public class Frog extends Animal{
    private Characteristic characteristic=new Characteristic("Croaks");
    private Description description=new Description("Eats Bugs");
    public Frog(){
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("disposing Frog");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog=new Frog();
        System.out.println("bye");
        frog.dispose();
    }
}
