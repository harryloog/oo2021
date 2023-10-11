public class First {
    public static void main(String[] args){
      /*primitiivtüübid:/System.out.println(args.length);
      String name = "Harry";
      byte bait = Byte.MAX_VALUE;
      int myInt = Integer.MAX_VALUE;
      double dounleNumber = 3.4;
      float floatNumber = 3.4f;
      boolean flag = True; // false
      char charcter = 'F';
      short myShort = Short.MAX_VALUE;
      LONG myLong = Long.MAX_VALUE;*/
      
      //foreach tsükkel
      
      
      //let array [];
      
      int[] numberArray2 = new int[5];
      int year = 2021;
      
      if (year > 2020){
        System.out.println("Aasta on suurem kui 2021"){
      }
      elseif (year = 2020){
        System.out.println("Aasta on võrdne 2021-ga"){
      }
      else (year < 2020){
        System.out.println("Aasta on väiksem kui 2021"){
      }
      String[] stringArray = new String[5];
      String[] greetingsArray = new String[]{"Hello","world","!"};
      
      for (int i = 0; i < greetingsArray.length; i++){
        System.out.println(greetingsArray[i]);
      }    //(algus: kaua: mis juhtub iga korraga)
      for (String text : greetingsArray){
        System.out.println(text);
      }
      
      
      int length = args.length;
      while (length > 0){
        length--;
        System.out.println("Inside while");
      }

      System.out.println("Hello world");
      System.out.println("Test one");
      System.out.println("Test two");
      System.out.print("\n");
  
      String hello = "Hello world!";
    }
  }
  /* function main(args){
      // compute something
  } */