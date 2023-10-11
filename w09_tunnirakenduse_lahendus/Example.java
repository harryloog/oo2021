import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Example {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();
        
        try {
            fh = new FileHandler("mylog.txt");
            fh.setFormatter(sf);
            logger.addHandler(fh);
        } catch (Exception e){
            System.out.println("I hope this doesn't happen");
        }





        try {
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e){
            System.out.println("There was an exception " + e.getMessage());
            logger.warning(e.getMessage());
        }
        try {
            getArrayElement(3);
        } catch (Exception e){
            System.out.println(e.getMessage());
            logger.severe(e.getMessage());
        }
        System.out.println("Game is over, here");
    }

    private static int getArrayElement(int i) {
        int[] intArray = new int[]{ 1, 2, 3 };
        return intArray[i];
    }
}
