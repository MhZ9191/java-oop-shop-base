package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        Prodotto test = new Prodotto("lampadina","Hello World!",new BigDecimal(10));
        System.out.printf("Nome esteso -> %s%n",test.extendedName());
        System.out.printf("Prezzo con iva -> %.2f $%n",test.getPricePlusIva());

        System.out.println(test.getPrice());

    }
}
