package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        
        Prodotto test = new Prodotto("test","Hello World!",33.5F);

        System.out.printf("Prezzo base -> %.2f%n",test.priceBase());
        System.out.printf("Prezzo piu' iva -> %.2f%n",test.pricePlusIva());
        System.out.printf("Nome esteso -> %s%n",test.extendedName());

    }
}
