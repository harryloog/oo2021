package com.example;

public class Main {
    public static void main(String[] args) {
        Jook jook6 = new Jook("Coca-Cola", 0.6, 0.7);
        Joogivaat vaat4 = new Joogivaat(60, 57, jook6);
        Kast kast2 = new Kast("A", 2.0, 5.0, 15);
        kast2.taidaKast(vaat4);
        System.out.println(kast2.kastimass);
    }
}
