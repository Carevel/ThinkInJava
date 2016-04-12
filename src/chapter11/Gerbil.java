package chapter11;

import java.util.ArrayList;

/**
 * Created by Changjiang on 2016/1/22.
 */

public class Gerbil {
    private static long counter;
    private final long id;
    public Gerbil(){
        id=counter++;
    }
    public void hop(){
        System.out.println(id+";正在跳跃");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils =new ArrayList<Gerbil>();
        for(int i=0;i<5;i++){
            gerbils.add(new Gerbil());
        }
        for(Gerbil gerbil :gerbils){
            gerbil.hop();
        }
    }
}

