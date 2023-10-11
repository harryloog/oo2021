package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void checkMassJoogiga(){
        Jook jook = new Jook("Fanta", 0.4, 0.9);
        Joogipudel joogipudel = new Joogipudel(0.5, "A", 0.1, 0.1, jook);
        Joogipudel joogipudel2 = new Joogipudel(1.5, "C", 0.3, 0.1);
        assertTrue(joogipudel.massJoogiga()==0.55);
        assertTrue(joogipudel2.massJoogiga()==0);
        


    }
    @Test
    public void checkOmahind(){
        Jook jook2 = new Jook("Fanta", 0.4, 0.9);
        Joogipudel joogipudel3 = new Joogipudel(0.5, "A", 0.1, 0.1, jook2);
        Joogipudel joogipudel4 = new Joogipudel(1.5, "C", 0.3, 0.1);
        assertTrue(joogipudel3.omahind()==0.1+0.5*0.4);
        assertTrue(joogipudel4.omahind()==0);
    }
    @Test
    public void checkTaidaJoogipudel(){
        Jook jook3 = new Jook("Fanta", 0.4, 0.9);
        Joogivaat vaat = new Joogivaat(15, 12, jook3);
        Joogipudel joogipudel5 = new Joogipudel(1.5, "C", 0.3, 0.1);
        vaat.taidaJoogipudel(joogipudel5);
        assertTrue(joogipudel5.jook.equals(jook3));
    }
    @Test
    public void checkPudelitesse(){
        Jook jook4 = new Jook("Fanta", 0.4, 0.9);
        Joogivaat vaat2 = new Joogivaat(15, 12, jook4);
        
        ArrayList<Joogipudel> pudelid = vaat2.pudelitesse();
        assertTrue(pudelid.size()==12/0.5);
    }
    @Test
    public void checkTaidaKast(){
        Jook jook5 = new Jook("Coca-Cola", 0.6, 0.7);
        Joogivaat vaat3 = new Joogivaat(60, 57, jook5);
        Kast kast = new Kast("B", 2.0, 5.0, 15);
        kast.taidaKast(vaat3);
        assertTrue(kast.pudelid.size()==15);
    }
    @Test
    public void checkKastMass(){
        Jook jook6 = new Jook("Coca-Cola", 0.6, 0.7);
        Joogivaat vaat4 = new Joogivaat(60, 57, jook6);
        Kast kast2 = new Kast("A", 2.0, 5.0, 15);
        kast2.taidaKast(vaat4);
        assertTrue(kast2.leiaMass()==2.0+(0.1*15)+(15*0.5*0.7));
    }
    @Test
    public void checkKastHind(){
        Jook jook7 = new Jook("Coca-Cola", 0.6, 0.7);
        Joogivaat vaat5 = new Joogivaat(60, 57, jook7);
        Kast kast3 = new Kast("C", 2.0, 5.0, 15);
        kast3.taidaKast(vaat5);
        assertTrue(kast3.leiaHind()==5.0+(0.1*15)+(15*1.5*0.6));
    }
}
