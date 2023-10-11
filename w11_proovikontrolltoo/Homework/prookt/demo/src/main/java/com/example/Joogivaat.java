package com.example;

import java.util.ArrayList;

public class Joogivaat {
    public double ruumala;
    public double sees;
    public Jook jook;

    public Joogivaat(double ruumala, double sees, Jook jook){
        this.ruumala = ruumala;
        this.sees = sees;
        this.jook = jook;
    }

    public void taidaJoogipudel(Joogipudel joogipudel) {
        if (joogipudel.jook==null && sees>=joogipudel.maht){
            joogipudel.jook = jook;
            sees-=joogipudel.maht;
        }
    }
    public ArrayList<Joogipudel> pudelitesse(){
        ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();
        while(sees>=0.5){
            pudelid.add(new Joogipudel(0.5, "A", 0.1, 0.1, jook));
            sees -= 0.5;
        }
        return pudelid;
    }
}
