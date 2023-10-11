import java.io.File;
import java.io.PrintWriter;


public class FileReadWrite {
    public static void main(String[] args) {
        File file = new File("dummy.txt");
        File filewrite = new File("1.txt");
        /*System.out.println(
            file.getname() + "\n" +
            file.isFile() + "\n" +
            file.isDirectory() + "\n" +
            file.isHidden() "\n" +
            file.lastModified()
        );
        */
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

            //Lugege sisse numberid failist ja leidke summa 
        }
    }
}
