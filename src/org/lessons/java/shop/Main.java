package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        Prodotto test = new Prodotto("lampadina","Hello World!",new BigDecimal(10),new BigDecimal(22));


        System.out.printf("Nome esteso -> %s%n",test.extendedName());
        System.out.printf("Prezzo base -> %.2f $%n",test.getPriceBase());
        System.out.printf("Prezzo con iva -> %.2f $%n",test.getPricePlusIva());

    }
}
