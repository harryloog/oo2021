package org.kt;

public class Main {
    public static void main(String[] args) {
        Joon2 joon2 = new Joon2(3, 2);
        int[] x = new int[]{1,2,3,4,5};
        int[] y = joon2.getY(x);
        for (int i : y) {
            System.out.println(i);
        }
    }
}
