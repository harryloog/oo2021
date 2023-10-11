package com.example;
/**
 * Joogipudel
 */
public class Joogipudel {

    public double maht;
    public String pudelitüüp;
    public double mass;
    public double taaramaksumus;
    public Jook jook;

    public Joogipudel(double maht, String pudelitüüp, double mass, double  taaramaksumus, Jook jook){
        this.maht = maht;
        this.pudelitüüp = pudelitüüp;
        this.mass = mass;
        this.taaramaksumus = taaramaksumus;
        this.jook = jook;
    }

    public Joogipudel(double maht, String pudelitüüp, double mass, double  taaramaksumus){
        this.maht = maht;
        this.pudelitüüp = pudelitüüp;
        this.mass = mass;
        this.taaramaksumus = taaramaksumus;
        this.jook = null;
    }

    public double massJoogiga(){
        if(jook!=null){
            return mass+maht*jook.erikaal;
        } else return 0;
    }

    public double omahind(){
        if(jook!=null){
            return taaramaksumus+maht*jook.liitriOmahind;
        } else return 0;
    }
}