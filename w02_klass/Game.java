import java.util.ArrayList;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int width = 20;
    int height = 10;

    World world = new World(width, height);
    GameCharacter player = new GameCharacter("Raimo", 2, 3, "C", GameCharacterType.WIZARD);
    GameCharacter dummy = new GameCharacter("Dummy", 2, 3, "D", GameCharacterType.WIZARD);
    GameCharacter witch = new GameCharacter("Witch", 2, 3, "W", GameCharacterType.WIZARD);
    ArrayList<GameCharacter> characters = new ArrayList<>();
    characters.add(player);
    characters.add(dummy);
    characters.add(witch);
    world.addCharacters(characters);
    world.render();
    System.out.println(player);

    Scanner scanner = new Scanner(System.in);
    String input = "";

    while(!input.equals("end")){
      input = scanner.nextLine();

      if (input.equals("")){
        player.move();
      } else if (input.toLowerCase().equals("l")){
        player.setDirection(Direction.LEFT);
      } else if (input.toLowerCase().equals("r")){
        player.setDirection(Direction.RIGHT);
      } else if (input.toLowerCase().equals("u")){
        player.setDirection(Direction.UP);
      } else if (input.toLowerCase().equals("d")){
        player.setDirection(Direction.DOWN);
      }

      while(player.x == dummy.x && player.y == dummy.y){
          player.x = (int)(Math.random()*width-1) +1;
          player.y = (int)(Math.random()*height-1) +1;
      }
      while(player.x == witch.x && player.y == witch.y){
        player.x = (int)(Math.random()*width-1) +1;
        player.y = (int)(Math.random()*height-1) +1;
      }
      dummy.isvisible = dummy.isvisible ? false : true;
      world.render();
      System.out.println(player);
    }
  }
}