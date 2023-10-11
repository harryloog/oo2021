import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Random random = new Random();
        ArrayList<Plant> plants = new ArrayList<Plant>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kui lai on maa?");
        int width = scanner.nextInt();
        System.out.println(("Kui kõrge?"));
        int height = scanner.nextInt();
        System.out.println("Kui kaua see kestab?");
        int time = scanner.nextInt();
        System.out.println("Palju muru soovid luua?");
        int grass_1= scanner.nextInt();
        System.out.println("Mitu põõsast soovid luua?");
        int bushes = scanner.nextInt();
        System.out.println("Mitu puud soovid luua?");
        int trees = scanner.nextInt();
        for (int q = 0; q < grass_1; q++){
            plants.add(q, new Grass("Muru", random.nextInt(5), random.nextInt(time), random.nextInt(width)));
            for (int r = 0; r < bushes && q == 1; r++){
                plants.add(q+r, new Bush("Põõsas", random.nextInt(5), random.nextInt(time), random.nextInt(height)));
                for (int s = 0; s < trees && r == 1; s++){
                    plants.add(q+r+s, new Tree("Puu", random.nextInt(5), random.nextInt(time), random.nextInt(width)));
                }
            }
        }
        
        
        
        for (int i = 0; i < time; i++){
            render(plants, width ,height);
            for (Plant plant : plants){
                plant.grow();
            }
        }
    }
    private static void render(ArrayList<Plant> plants, int width, int height){
        String[][] image = new String[height][width];
        String[][][] temp = new String[plants.size()][height][width];
        for (int i = 0; i<plants.size(); i++){
            for (int j = 0; j<plants.get(i).draw().length && j<height; j++){
                for (int k = 0; k+plants.get(i).location<width && k<width && k<plants.get(i).draw()[j].length(); k++){
                    temp[i][height-1-j][plants.get(i).location+k] = plants.get(i).draw()[j].split("")[k];
                }
            }
        }
        for (int l = 0; l< plants.size(); l++){
            for (int m = 0; m<height; m++){
                for (int n = 0; n<width; n++){
                    if(temp[l][m][n]!=null){
                        image[m][n] = temp[l][m][n];
                    }
                }
            }
        }
        System.out.println("|"+"‾".repeat(width)+"|");
        for (int o = 0; o<height; o++){
            System.out.print("|");
            for ( int p = 0; p<width; p++){
                if (image[o][p] == "" || image[o][p] == " " || image[o][p] == null){
                    System.out.print(" ");
                    //System.out.print(o+";"+p);
                } else {
                    System.out.print(image[o][p]);
                //System.out.print(o+","+p);
                }
            }
            System.out.println("|");
        }
        System.out.println("|"+"_".repeat(width)+"|");
    }
}