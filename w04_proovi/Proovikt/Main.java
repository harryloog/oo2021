import java.util.Scanner;

//import java.util;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta 3 arvu");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        System.out.println(average(int1, int2, int3));

        int[] arr = {41,75,324,65,43,65,5,65,35,6,56,56,34,56,32};

        Double[] arr2 = aveg(arr);

        for (Double i : arr2){
            System.out.println(i);
        }
    }

    public static Double average(int w, int e, int y){
        Double avg = (double) ((w + e + y) / 3);
        return avg;
    }

    public static Double[] aveg(int[] i){
        Double[] avgs = new Double[i.length-2];
        for (int j = 0; j<i.length-2; j++) {
            avgs[j]=(double) ((i[j]+i[j+1]+i[j+2])/3);
        }
        return avgs;
    }
}