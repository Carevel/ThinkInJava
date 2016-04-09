package com.thinkinjava.chapter11;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Changjiang on 2016/4/4.
 */
public class Gerbil {
    private static long counter;
    private final long id;
    public Gerbil(){
        id=counter++;
    }
    public void hop(){
        System.out.println("Gerbil:"+id+" 正在跳");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils=new ArrayList<>();
        for(int i=0;i<5;i++){
            gerbils.add(new Gerbil());
        }
        for(Gerbil g :gerbils){
            g.hop();
        }
        for(int i=0;i<gerbils.size();i++){
            ((Gerbil)gerbils.get(i)).hop();
        }
        //面向接口编程
        List<Gerbil> gs=new ArrayList<>();
        for(int i=0;i<2;i++){
            gs.add(new Gerbil());
        }
        for(Gerbil g :gs){
            g.hop();
        }
    }
}
