package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Class Adapter");

        //American plug in American Socket
        AmericanPlug americanPlug = new AmericanPlug();
        americanPlug.plugIsIn();

        //American plug in European Socket
        AmericanToEuropean adapter = new AmericanToEuropean(americanPlug);
        adapter.plugIsIn();

    }
}