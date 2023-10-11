import java.util.Scanner;
import java.lang.Math;

public class Kahend {
    public static void main(String[] args) {
        System.out.println("Sisesta kuni kümnekohaline kahendsüsteemi arv:");
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String number = nextLine;
        if (number.length() <= 10){
           if (checkBinary(number)){
               int decimalnumber = getDecimal(number);
               System.out.println("Sisestatud arv on kümnendsüsteemis " + decimalnumber + ".");
           } else {
               System.out.println("Sisestatud arv ei ole kahendsüsteemis!");
           }
        }else {
            System.out.println("Arv on liiga suur!");
        } 
    }

    public static boolean checkBinary(String number) {
        boolean binary = false;
        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i)=='1'||number.charAt(i)=='0'){
                binary = true;
            } else {
                binary = false;
            }
        }
        return binary;
    }

    public static int getDecimal(String number) {
        int decimal = 0;
        for (int i = 0; i < number.length(); i++){
            int num = Character.getNumericValue(number.charAt(number.length()-(1+i)));
            int current = num * (int) Math.pow(2, i);
            decimal += current;
            System.out.println(num + " - " + current);
        }
        return decimal;
    }
}