import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> linnad = new ArrayList<Integer>();
        try (Scanner scanner = new Scanner(new File("linnad.txt"))){
            while (scanner.hasNextLine()){
                linnad.add(Integer.parseInt(scanner.nextLine()));
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        List<Integer> linnad2 = linnad.stream()
            .filter(element -> element > 50000)
            .map(element -> element/1000)
            .peek(System.out::print)
            .collect(Collectors.toList());
        try (PrintWriter pw = new PrintWriter(new File("linnad_output.txt"))){
            for(Integer i : linnad2){
                pw.println(i);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
