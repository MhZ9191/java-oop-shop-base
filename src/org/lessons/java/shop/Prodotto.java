package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int code;
    public String name;
    public String description;
    public float price;
    public int iva;

    public Prodotto(String name,String description,float price){
        Random rnd = new Random();
        this.code=rnd.nextInt(99999);
        this.name=name;
        this.description=description;
        this.price=price;
        this.iva=22;    
    }

    float priceBase(){
        return this.price;
    }

    float pricePlusIva(){
        return this.price+((this.price*this.iva)/100);
    }

    String extendedName(){
        return this.code+"-"+this.name;
    }
}
