package chapter15.generics;

import utils.Generator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Changjiang on 2016/07/10.
 */
class Product {
    private final int id;
    private String desctiption;
    private double price;
    public Product(int IDNumber,String desctiption,double price){
        this.id=IDNumber;
        this.desctiption=desctiption;
        this.price=price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  id+":"+desctiption+", price:"+price;
    }
    public void priceChange(double change){
        price+=change;
    }
    public static Generator<Product> generator =new Generator<Product>() {
       private Random random=new Random(47);
        @Override
        public Product next() {
            return new Product(random.nextInt(10000),"Test",Math.round(random.nextDouble()*1000.0)+0.99);
        }
    };
}

class Shelf extends ArrayList<Product>{
    public Shelf(int nProducts){
        Generators.fill(this,Product.generator,nProducts);
    }
}

class Aisle extends ArrayList<Shelf>{
    public Aisle (int nShelves,int nProducts){
        for(int i=0;i<nShelves;i++){
            add(new Shelf(nProducts));
        }
    }
}
class CheckoutStand{}
class Office{}
public class Store extends ArrayList<Aisle>{
    private ArrayList<CheckoutStand> checkoutStands=new ArrayList<CheckoutStand>() ;
    private Office office=new Office();
    public Store(int nAsisles,int nShevles,int nProducts){
        for(int i=0;i<nAsisles;i++){
            add(new Aisle(nShevles,nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        for(Aisle a:this){
            for(Shelf s:a){
                for(Product p:s){
                    sb.append(p);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14,5,10));
    }
}
