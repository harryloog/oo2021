import  java.util.Scanner;

public class Threads {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Sisesta I threadi esimene number:");
        numbers[0] = scanner.nextInt();
        System.out.println("Sisesta II threadi esimene number:");
        numbers[1] = scanner.nextInt();
        System.out.println("Sisesta III threadi esimene number:");
        numbers[2] = scanner.nextInt();
        for ( int i= 0; i<3;i++){
            try{
                new Thread(getRunnable(numbers[i]), "Thread"+(i+1)).start();
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static Runnable getRunnable(int number) {
        return () -> {
            for ( int i = 1; i < 5; i++){
                try{
                    System.out.println(Thread.currentThread().getName()+ ": "+ Math.pow(number, i));
                    Thread.sleep(1000);
                } catch ( Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };  
    } 
}