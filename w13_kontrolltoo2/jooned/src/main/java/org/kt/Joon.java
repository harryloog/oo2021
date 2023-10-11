package org.kt;

/**
 * Hello world!
 *
 */
public class Joon implements JoonLiides {
    public int a;

    public Joon(int a){
        this.a = a;
    }

    @Override
    public int getY(int x) {
        int y = a*x;
        return y;
    }
    @Override
    public int[] getY(int[] x) {
        int[] y = new int[x.length];
        for (int  i = 0; i< x.length; i++) {
            y[i] = a*x[i];
        }
        return y;
    }
    
}
