package org.hangman;

import java.util.Scanner;
import java.util.Arrays;


public class Game{
    //private static int counter = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static String continu = "y";
    private static Hangman[] hangmans = new Hangman[100];
    private static Gallows[] gallowss = new Gallows[100];
    public static void main(String[] args) {
        System.out.println("Mängid poomismängu!");
        int counter = 0;
        game(counter);
        counter ++;
        while(continu.equals("y")){
            boolean cont = quest(counter);
            counter ++;
            if(!cont){
                break;
            }
        }
    }

    public static boolean quest(int counter) {
        System.out.println("Kas soovid uuesti mängida?");
        continu = scanner.next();
        if (continu.equals("y")){   
            game(counter);
            return true;
        } else {
            return false;
        }
    }
    
    public static void game(int counter) {
        hangmans[counter] = new Hangman();
        gallowss[counter] = new Gallows();
        
        while(hangmans[counter].wrongGuess<8){
            render(hangmans[counter], gallowss[counter]);
            hangmans[counter].play();
            if(!(Arrays.asList(hangmans[counter].getSplitLength()).contains(null))){
                break;
            }
        }
        if(hangmans[counter].wrongGuess==8){
            System.out.println(gallowss[counter].draw(hangmans[counter].wrongGuess));
            System.out.println("Kaotasid!");
            System.out.println("Õige sõna oli: "+hangmans[counter].word);
        } else if (hangmans[counter].wrongGuess<8){
            System.out.println("Võitsid!");
        }
    }

    public static void render(Hangman hangman, Gallows gallows){
        System.out.println(gallows.draw(hangman.wrongGuess));
        System.out.println("Vigu: "+hangman.wrongGuess+"/7");
        for (String s : hangman.getSplitLength()) {
            if (s!=null){
                System.out.print(s);
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
        System.out.println("Paku täht:");

        
    }
    
    
}
