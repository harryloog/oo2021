import java.util.ArrayList;

public class World {
    private int width;
    private int height;
  
    private GameCharacter gameCharacter;
    private ArrayList<GameCharacter> characters;
    public World(int width, int height){
      this.width = width;
      this.height = height;
    }
  
    public void addCharacters(ArrayList<GameCharacter> c){
      this.characters = c;
    }

    public getCharacter
  
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
  
          if (gameCharacter.x == x && gameCharacter.y == y){
            symbol = 'C';
          }
          for (GameCharacter c:characters)
            if (x==c.x && y == c.y)
                c.isvisible ? symbol = c.getSymbol() : symbol = " ";
            }
        }

          System.out.print(symbol);
        }
  
        System.out.println("");
      }
    }
  }
