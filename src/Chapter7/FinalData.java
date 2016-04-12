package Chapter7;

import java.util.Random;

/**
 * Created by Changjiang on 2015/6/11.
 */
class Value{
    int i;
    public Value(int i){
        this.i=i;
    }
}

public class FinalData {
    private static Random rand=new Random(47);
    private String id;
    public FinalData(String id){
        this.id=id;
    }
    private final int valueOne=9;
    private static final int VALUE_TWO=99;
    private final int i4=rand.nextInt(20);
    static final int INT_5=rand.nextInt(20);
    private Value  v1=new Value(1);
    private final Value v2=new Value(22);
    private static final Value VAL_3=new Value(33);

    private final int[] a={1,3,5,6};
    public String toString(){
        return id+":"+"i4="+i4+",INT_5="+INT_5;
    }
    public static void main(String[]  args){
        FinalData fd1=new FinalData("fd1");
        //fd1.valueOne++;
        fd1.v2.i++;
        fd1.v1=new Value(2);
        for(int i=0;i<fd1.a.length;i++){
            fd1.a[i]++;
        }

        //fd1.v2=new Value(23);
        //fd1.VAL_3=new Value(1);
        //fd1.a=new int[]{3,5,6,};
        System.out.println(fd1);
        System.out.println("....FinalData2");
        FinalData fd2=new FinalData("fd2");
        System.out.print(fd2);
    }
}
