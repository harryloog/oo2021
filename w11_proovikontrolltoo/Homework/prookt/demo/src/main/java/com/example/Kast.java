package com.example;

import java.util.ArrayList;

public class Kast {
    public String kastitüüp;
    public double kastimass;
    public double kastihind;
    public int pesadearv;
    public ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();

    public Kast(String kastitüüp, double kastimass, double kastihind, int pesadearv){
        this.kastitüüp=kastitüüp;
        this.kastimass=kastimass;
        this.kastihind=kastihind;
        this.pesadearv=pesadearv;
    }

    public double leiaMass(){
        double kmass = kastimass;
        for (Joogipudel joogipudel : pudelid) {
            kmass += joogipudel.massJoogiga();
        }
        return kmass;
    }

    public double leiaHind(){
        double hind = kastihind;
        for (Joogipudel joogipudel : pudelid) {
            hind += joogipudel.omahind();
        }
        return hind;
    }

    public void taidaKast(Joogivaat vaat)   {
        switch (kastitüüp) {
            case "A":
                while (vaat.sees>=0.5 && pudelid.size()<pesadearv) {
                    pudelid.add(new Joogipudel(0.5, kastitüüp, 0.1, 0.1, vaat.jook));
                    vaat.sees -= 0.5;
                }
                break;
            case "B":
                while (vaat.sees>=1.0 && pudelid.size()<pesadearv) {
                    pudelid.add(new Joogipudel(1.0, kastitüüp, 0.2, 0.1, vaat.jook));
                    vaat.sees -= 1.0;
                }
                break;
            case "C":
                while (vaat.sees>=1.5 && pudelid.size()<pesadearv) {
                    pudelid.add(new Joogipudel(1.5, kastitüüp, 0.3, 0.1, vaat.jook));
                    vaat.sees -= 1.5;
                }
                break;
        }
        
    }








}
