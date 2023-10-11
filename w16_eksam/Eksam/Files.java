import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files {
    try (Scanner scanner = new Scanner(new File("data.txt"));
            PrintWriter pw = new PrintWriter(new File("data_output.txt"))){
            while (scanner.hasNextLine()){
                pw.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    
        File file = new File("random.txt");
        File filewrite = new File("ilus.txt");
        Filereader fr = new Filereader(file);
        String line = fr.readLine();
        int sum = 0;
        while (line!=null()){
            int[] lineData = Integer.parseInt(line.split(", "));
            for(int i : lineData){
                sum = sum + i;
            }
            
            
        }
    
        System.out.println(linedata[0]);

        Filereader fr = new Filereader(file);
        

        Bufferedreader br =  new Bufferedreader(fr);

        String line = br.readLine();
        while (line != null){
            String[] lineData = line.split(",");
            System.out.println(lineData[0] + "  |  " + lineData[lineData.length-1]);
            
            line = br.readline();
        }


        fr.close();
        br.close();
        

        if (!fileWrite.exists()){
            fileWrite.createNewFile();
        }
        

        PrintWriter pw = new PrintWriter(fileWrite);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String line2 = scanner.nextLine();
            String[] lineData = line2.split(",");

    
            pw.println(
                "Number is " +lineData[0] + 
                " and name is " + lineData[1] +
                " and lang is " + lineData[2] +
                " and year is " + lineData[3]
            );

            scanner.close();
            pw.close();

        
}
