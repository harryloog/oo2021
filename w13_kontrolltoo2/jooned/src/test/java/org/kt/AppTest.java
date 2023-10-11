package org.kt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void checkJoonGetY()
    {
        Joon joon = new Joon(3);
        assertTrue(joon.getY(2)==6);
        assertTrue(joon.getY(4)==12);
        assertTrue(joon.getY(3)==9);
    }@Test
    public void checkJoon2GetY()
    {
        Joon2 joon2 = new Joon2(3, 1);
        assertTrue(joon2.getY(2)==7);
        assertTrue(joon2.getY(4)==13);
        assertTrue(joon2.getY(3)==10);
        Joon2 joon2_2 = new Joon2(3, 2);
        assertTrue(joon2_2.getY(2)==8);
        assertTrue(joon2_2.getY(4)==14);
        assertTrue(joon2_2.getY(3)==11);
    }
    @Test
    public void checkJoon2ArrayGetY()
    {
        Joon2 joon2 = new Joon2(3, 2);
        int[] x = new int[]{1,2,3,4,5};
        int[] y = new int[]{5,8,11,14,17};
        assertArrayEquals(y, joon2.getY(x));
    }
    @Test
    public void checkJoonFile(){
        String line = "";
        try (Scanner scanner = new Scanner(new File("C:/Users/User/Documents/Kool/Kevad 2021/Objektorienteeritud programmeerimine/w13_kontrolltoo2/jooned/src/main/java/org/kt/joon.txt"))){
            while (scanner.hasNextLine()){
                line += scanner.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        int[] array = new int[4]; 
        for (int i = 0; i<4; i++) {
            array[i] = Integer.parseInt(line.split(",")[i]);
        }
        int a = array[0];
        int c = array[1];
        int min = array[2];
        int max = array[3];
        JoonLiides joonfail;
        if (c==0){
            joonfail = new Joon(a);
        } else {
            joonfail = new Joon2(a, c);
        }
        int[] x = new int[max-min];
        for (int j = 0; j < x.length; j++) {
            x[j] = j+min;
        }
        int[] y = new int[]{56,61,66,71,76};
        assertArrayEquals(y, joonfail.getY(x));
    }


}
