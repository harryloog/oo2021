import java.util.Random;

public abstract class Plant {
    public String name;
    public int location;
    public int length;
    public int time;


    public Plant(String name, int length, int time, int location){
        this.name = name;
        this.length = length;
        this.time = time;
        this.location = location;
    }

    public void grow(){
        if (this.time!=0){
            this.time -= 1;
            this.length += 3;
            if (this.time == 0){
                this.die();
            }
            Random random = new Random();
            if (random.nextInt(10)==0){
                this.wither();
            }
        }
    }

    public void wither(){
        this.time = 0;
        this.length = this.length/2;
    }

    public void die(){
        this.length = 0;
        this.name = "";
    }

    public String[] draw(){
        String image[] = new String[length-1];
        image[0] = "";
        image[length-1] = "";
        for (int i = 1; i<length-1; i++){
            image[i] = "";
        }
        return image;
            
    }
}