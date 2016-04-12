package polymorphism;

/**
 * Created by Changjiang on 2015/6/14.
 */
class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refCount++;
    }

    protected void dispose() {
        if (--refCount == 0) {
            System.out.println("disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared "+id;
    }
}

class Composing{
    private Shared shared;
    private static long counter=0;
    private final long id=counter++;
    public Composing (Shared shared){
        System.out.println("Creating "+this);
        this.shared=shared;
        this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("disposing "+this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing "+id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared=new Shared();
        Composing c1=new Composing(shared);
        
        Composing c2=new Composing(shared);
        Composing c3=new Composing(shared);
        Composing c4=new Composing(shared);

        Composing[] composing={c1,c2,c3,c4};

        for(Composing c:composing){
            c.dispose();
        }
    }
}
