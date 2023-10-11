package org.hangman;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class Hangman implements Keyboard{
   private static String[] words = {"apple", "banana", "programming", "thunderstorm"};
   private static Random r = new Random();
   public String word = words[(r.nextInt(words.length))];
   public int wrongGuess = 0;
   public String[] splitWord = word.split("");
   public String[] splitLength = new String[word.length()];
   public static ArrayList<String> wrong = new ArrayList<String>();

   public void play(){
      String guessed = getInput();
      if(inWord(splitWord, guessed)){
         splitLength = fillList(splitWord, splitLength, guessed);
      }
      else{
         wrongGuess ++;
         if(!wrong.contains(guessed)){
            wrong.add(guessed);
         }
      }
   }

   @Override
   public String getInput(){
      Scanner scGuess = new Scanner(System.in);
      //scGuess.close();
      return scGuess.next();
      
   }

   public static boolean inWord(String[] list, String inString){
      for (String string : list) {
         if (string.equals(inString)){
            return true;
         }
      }
      return false;
   }

   public static String[] fillList(String[] fromList, String[] toList, String string){
      for (int i = 0; i < fromList.length; i++){
         if (fromList[i].equals(string)){
            toList[i] = string;
         }
      }
      return toList;
   }

   public String[] getSplitLength(){
      return splitLength;
   }
}