package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    //COSTRUTTORE SENZA PARAMETRI
    public Prodotto(){
        Random rnd = new Random();
        this.code=rnd.nextInt(99999);
        this.name="unnamed";
        this.description="undescription";
        this.price=new BigDecimal(0);
        this.iva=new BigDecimal(22);
    }

    //COSTRUTTORE CON IVA COME PARAMETRO
    public Prodotto(String name,String description,BigDecimal price,BigDecimal iva){
        Random rnd = new Random();
        this.code=rnd.nextInt(99999);
        this.name=name;
        this.description=description;
        this.price=price;
        this.iva=iva;    
    }
    //COSTRUTTORE CON IVA DI DEFAULT 22
    public Prodotto(String name,String description,BigDecimal price){
         Random rnd = new Random();
        this.code=rnd.nextInt(99999);
        this.name=name;
        this.description=description;
        this.price=price;
        this.iva=new BigDecimal(22);
    }

    //GETTER & SETTER
    public int getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name!=null && name.trim()!=""){
            this.name=name;
        }
    }
    public String getDescription(){
            return this.description;
    }
    public void setDescription(String description){
        if(description!=null&&description.trim()!=""){
            this.description=description;
        }
    }
    public BigDecimal getPrice(){
        return this.price.setScale(2,RoundingMode.DOWN);
    }
    public void setPrice(BigDecimal price){
        if(price!=null&&price.compareTo(BigDecimal.ZERO)>=0){
            this.price=price.setScale(2,RoundingMode.DOWN);
        }
    }
    public BigDecimal getIva(){
        return this.iva;
    }
    public void setIva(BigDecimal iva){
        if(iva!=null&&iva.compareTo(BigDecimal.ZERO)>=0){
            this.iva=iva;
        }    
    }


    public BigDecimal getPricePlusIva(){
            return price.add(price.multiply(iva).divide(new BigDecimal(100))).setScale(2,RoundingMode.DOWN);
    }

    public String extendedName(){
            return this.code+" - "+this.name;
    }
}
