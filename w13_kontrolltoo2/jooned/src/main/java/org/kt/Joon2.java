package org.kt;

public class Joon2 implements JoonLiides{
    public int a;
    public int c;

    public Joon2(int a, int c){
        this.a = a;
        this.c = c;
    }

    @Override
    public int getY(int x) {
        int y = a*x +c ;
        return y;
    }
    @Override
    public int[] getY(int[] x){
        int[] y = new int[x.length];
        for (int  i = 0; i< x.length; i++) {
            y[i] = a*x[i]+c;
        }
        return y;
    }

    
    
}
