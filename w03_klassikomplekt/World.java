import java.util.ArrayList;

public class World {
  private int width;
  private int height;


  private ArrayList<GameCharacter> characters;
  private ArrayList<Item> items = new ArrayList<>();

  public World(int width, int height){
    this.width = width;
    this.height = height;
  }

  public void addCharacters(ArrayList<GameCharacter> c){
    this.characters = c;
  }

  public void addItem(Item i, int x , int y) {
    this.items.add(i);
    i.x = x;
    i.y = y;
  }

  public void addItem(Item i) {
    this.items.add(i);
  }

  public void removeItem(Item i) {
    this.items.remove(i);
  }

  public ArrayList<Item> getItems() {
    return(this.items);
  }

  public void render(){
    char symbol;

    for (int y = 0; y <= height; y++){
      for (int x = 0; x <= width; x++){
        if (y == 0 || y == height){
          symbol = '-';
        } else if (x == 0 || x == width){
          symbol = '|';
        } else {
          symbol = ' ';
        }

        for (GameCharacter c : characters){
          if (x == c.x && y == c.y && c.isVisible){
            symbol = c.getSymbol();
          }  
        }

        for (Item i: items){
          if (x == i.x && y == i.y && i.isOnGround){
            symbol = i.getSymbol();
          }
        }

        System.out.print(symbol);
      }

      System.out.println("");
    }
  }
}