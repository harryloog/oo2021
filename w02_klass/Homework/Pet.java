import java.lang.Integer;
import java.util.ArrayList;
import java.util.Scanner;

public class Pet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        boolean hunger = false;
        String species = "";
        String gender = "";
        
        ArrayList<Animal> animal = new ArrayList();

        System.out.println("Mitu looma soovid võtta?");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        for (int i = 0; i < num; i++){
            System.out.println("Mis on looma liik?");
            species = scanner.nextLine();
            System.out.println("Mis soost loom on?(m/n)");
            gender = scanner.nextLine();
            animal.add(new Animal("animal" + Integer.toString(i), species, gender));
            System.out.println("Mis on looma nimi?");
            String name = scanner.nextLine();
            (animal.get(i)).setName(name);
        }
        while(!input.equals("quit")){
            System.out.println("Kas soovid looma atribuute muuta? Väljumiseks ''quit''");
            input = scanner.nextLine();
            if (input.equals("y")){
                System.out.println("Vali loom:");
                int j = 0;
                for(Animal i : animal){
                    j++;
                    System.out.println(i.getName()+" (" +Integer.toString(j)+")");
                }
                
                int number = -1 + Integer.parseInt(scanner.nextLine());

                if (animal.size() > number){
                    System.out.println("Kas soovid looma nime muuta?");
                    input = scanner.nextLine();
                    if (input.equals("y")){
                        System.out.println("Sisesta uus nimi:");
                        String newname = scanner.nextLine();
                        (animal.get(number)).setName(newname);
                    }
                } else {
                    System.out.println("Sellist looma pole olemas!");
                }
                System.out.println("Kas soovid vaadata looma infot?");
                input = scanner.nextLine();
                    if (input.equals("y")){
                    System.out.println("Vali loom:");
                    int g = 0;
                    for(Animal i : animal){
                        g++;
                        System.out.println(i.getName()+" ("+g+")");
                    }
                    int number2 = -1 + Integer.parseInt(scanner.nextLine());

                    if (animal.size() > number){
                        System.out.println((animal.get(number)).species);
                        System.out.println((animal.get(number)).getName());
                        String gen = (animal.get(number)).getGender();
                        if (gen.equals("n")){
                            System.out.println("Loom on emane.");
                        } else if (gen.equals("m")){
                            System.out.println("Loom on isane.");
                        }
                    } else {
                    System.out.println("Sellist looma pole olemas!");
                    }
                }
            }
        }
    }
}