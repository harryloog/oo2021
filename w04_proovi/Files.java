import java.io.File;
import java.io.PrintWriter;


public class Files {
    public static void main(String[] args) {
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
    
        System.out.println(linedata[0);
    }
}
