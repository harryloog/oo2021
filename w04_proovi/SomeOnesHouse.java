import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;



public class SomeOnesHouse {
    public static void main(String[] args) throws IOException{
        int width = 500;
        int height = 500;
        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = picture.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        
        g.setColor(Color.BLACK);
        g.drawString("My house", 225, 25);

        g.drawLine(250, 100, 450, 300);
        g.drawLine(250, 100, 50, 300);
        g.fillRect(50, 300, 400, 150);
        ImageIO.write(picture, "png", new File("house.png"));
    }
}
