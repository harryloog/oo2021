import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //Scanner scanner = null;
        
     /*   try {
            scanner = new Scanner(new File("datax.txt"));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println();
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
*/
        List<Integer> integerList = new List<Integer>();
            
        
        try (Scanner scanner = new Scanner(new File("linnad.txt"));
            PrintWriter pw = new PrintWriter(new File("sorditud_linnad.txt"))){
            while (scanner.hasNextLine()){
                line = scanner.nextLine();

                pw.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
