import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;


public class OnlineRW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(
                new URL("http://www.tlu.ee/~ray/lengths.txt").openStream()));

        PrintWriter pw = new PrintWriter(new FileWriter("answer.txt"))


        String line = br.readLine();
        String lineData[] = line.split(" ");

        System.out.println(br.readLine());
        System.out.println(sum(lineData));
        System.out.println(average(lineData));

        pw.println("Sum is " +sum(lineData));
        pw.println("Average is" + average(lineData));

    }

    public static int sum(String[] input) {
        int sum = 0;
        for (String Data : input){
            sum += Integer.parseInt(Data);
        }
        return sum;
    }

    public static double average(String[] input) {
        double sum = 0;
        for (String Data : input){
            sum += Double.parseDouble(Data);
        }
        return sum(input)/input.length+1;
    }
}
