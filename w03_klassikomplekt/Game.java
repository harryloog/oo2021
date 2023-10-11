import java.util.*;

public class Game {
  public static void main(String[] args) {
    int width = 20;
    int height = 10;

    World world = new World(width, height);

    Inventory inventory = new Inventory(5);

    GameCharacter player = new GameCharacter("Harry", 18, 2, 'C', GameCharacterType.WIZARD);
    GameCharacter dummy = new GameCharacter("Dummy", 5, 6, 'D', GameCharacterType.WIZARD);
    GameCharacter witch = new GameCharacter("Witch", 8, 9, '?', GameCharacterType.WIZARD);

    ArrayList<GameCharacter> characters = new ArrayList<>();
    characters.add(player);
    characters.add(dummy);
    characters.add(witch);

    Item coin = new Item(3, 5, ItemType.GOLD);
    Item weapon = new Item(6, 8, ItemType.WEAP);
    Item armor = new Item(2, 7, ItemType.ARMOR);
    Item misc = new Item(7, 4, ItemType.MISC);
    
    world.addItem(coin);
    world.addItem(weapon);
    world.addItem(armor);
    world.addItem(misc);

    world.addCharacters(characters);
    world.render();
    inventory.render();
    System.out.println(player);

    Scanner scanner = new Scanner(System.in);
    String input = "";

    while(!input.equals("end")){
      input = scanner.nextLine().toLowerCase();

      if (input.equals("")){
        player.move();
      } else if (input.equals("l")){
        player.setDirection(Direction.LEFT);
      } else if (input.equals("r")){
        player.setDirection(Direction.RIGHT);
      } else if (input.equals("u")){
        player.setDirection(Direction.UP);
      } else if (input.equals("d")){
        player.setDirection(Direction.DOWN);
      } else if (input.equals("t")){
        ((inventory.getInventory()).get(0)).isOnGround = true;
        world.addItem(((inventory.getInventory()).get(0)), player.x, player.y-1);
        inventory.removeItem();
      }

      if (player.x == witch.x && player.y == witch.y){
        player.x = (int)(Math.random() * width - 1) + 1;
        player.y = (int)(Math.random() * height - 1) + 1;
      }
      
      ArrayList<Item> toRemove = new ArrayList<>();

      for (Item item : world.getItems()){
        if (item.isOnGround && player.x == item.x && player.y == item.y){
          inventory.addItem(item);
          toRemove.add(item);
        }
      }

      (world.getItems()).removeAll(toRemove);
      world.render();
      inventory.render();
      System.out.println(player);
    }
  }
}