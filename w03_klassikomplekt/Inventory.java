import java.util.ArrayList;

public class Inventory {
    private int spaces;
    private ArrayList<Item> inventoryitems = new ArrayList();

    public Inventory(int spaces){
        this.spaces = spaces;
    }

    public void addItem(Item i){
        this.inventoryitems.add(i);
        i.isOnGround =false;
    }

    public void removeItem(){
      this.inventoryitems.remove(0);
    }

    public ArrayList<Item> getInventory() {
      return(this.inventoryitems);
    }
  
    public void render(){
      if (this.inventoryitems.size()>0){
        String line = new String(new char[this.spaces]).replace("\0", "--");
        System.out.println(line+'-');
        for (int space = 0; space < this.spaces; space++){
          System.out.print("|");
          if (this.inventoryitems.size()>space){
            System.out.print((this.inventoryitems.get(space)).getSymbol());
          } else System.out.print(' ');
          System.out.print("");
        }
        System.out.println("|");
        System.out.println(line+'-');
      }  
    }
}