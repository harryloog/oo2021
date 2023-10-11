public class Tree extends Plant{
    public Tree(String name, int length, int time, int location){
        super(name, length, time, location);
    }

    @Override
    public String[] draw(){
        if (length>0){
            String image[] = new String[length+3];
            image[0] = "  /     \\ ";
            Bush canopy = new Bush("Võra", 3, this.time, 0);
            String[] temp = canopy.draw();
            image[image.length-3] = temp[0];
            image[image.length-2] = temp[1];
            image[image.length-1] = temp[2];
            for (int i = 1; i<image.length-3; i++){
                image[i] = "  |    |  ";
            }
            return image;
        }
        return new String[0];
    }
}