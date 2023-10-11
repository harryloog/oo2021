import java.util.Random;

public class Grass extends Plant{

    public Grass(String name, int length, int time, int location) {
        super(name, length, time, location);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void grow(){
        if (length>0){
            if (this.time!=0){
                this.time -= 1;
                this.length += 1;
                if (this.time == 0){
                    this.die();
                }
                Random random = new Random();
                if (random.nextInt(10)==0){
                    this.wither();
                }
            }
        }
    }

    @Override
    public String[] draw(){
        String image[] = new String[length];
        for (int i=0;i<length;i++){
            image[i] = "M  M MMM M  M";
        }
        return image;
    }
}