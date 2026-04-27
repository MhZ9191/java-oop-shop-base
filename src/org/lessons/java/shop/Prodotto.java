package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    public int code;
    public String name;
    public String description;
    public BigDecimal price;
    public BigDecimal iva;

    public Prodotto(String name,String description,BigDecimal price,BigDecimal iva){
        Random rnd = new Random();
        this.code=rnd.nextInt(99999);
        this.name=name;
        this.description=description;
        this.price=price;
        this.iva=iva;    
    }

    public BigDecimal getPriceBase(){
        return this.price;
    }

    public BigDecimal getPricePlusIva(){
        if(price!=null && iva !=null){
            return price.add(price.multiply(iva).divide(new BigDecimal(100))).setScale(2,RoundingMode.DOWN);
        }
        return null;
    }

    public String extendedName(){
        if(name!=null){
            return this.code+" - "+this.name;
        }
        return null;
    }
}
