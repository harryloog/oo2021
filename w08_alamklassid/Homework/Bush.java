import java.util.Random; 
 
public class Bush extends Plant{

    public Bush(String name, int length, int time, int location) {
        super(name, length, time, location);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void grow(){
        if (this.time!=0){
            this.time -= 1;
            this.length += 2;
            if (this.time == 0){
                this.die();
            }
            Random random = new Random();
            if (random.nextInt(10)==0){
                this.wither();
            }
        }
    }

    @Override
    public String[] draw(){
        if (length>0){
            String image[] = new String[length];
            image[0] = "\\        /";
            image[length-1] = "/‾‾‾‾‾‾‾‾\\";
            for (int i = 1; i<length-1; i++){
                image[i] = "|        |";
            }
            return image;
        }
        return new String[0];
    }
}