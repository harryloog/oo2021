public class Item {
  private ItemType itemType;
  private char symbol;
  public boolean isOnGround;
  public int x;
  public int y;

  public Item(int x, int  y, ItemType itemType){
    this.x = x;
    this.y = y;
    this.itemType = itemType;
    this.isOnGround = true;
  }

  public char getSymbol(){
    switch(this.itemType){
      case GOLD:
        this.symbol = 'G';
        break;
      case MISC:
        this.symbol = 'M';
        break;
      case WEAP:
        this.symbol = '!';
        break;
      case ARMOR:
        this.symbol = 'A';
        break;
      default:
        break;
    }
    return(this.symbol);
  }   
}