import java.util.Random;

public class Cat implements Animal{
    public String name;

    public Cat(String name){
        name = this.name;
    }

    @Override
    public String speak() {
        String call = "Kass mäugub!";
        return call;
    }

    @Override
    public String eat() {
        Random r = new Random();
        String[] food = new String[]{"sööb kana", "püüab linnu", "rikub vaiba ära"};
        return ("Kass "+food[r.nextInt(3)]+"!");
    }

    @Override
    public String sleep() {
        return("Kass magab!");
    }

    @Override
    public String beSneaky() {
        return("*krõks*");
    }

    @Override
    public String lookAround() {
        return("Kass vaatab ringi!");
    }

    @Override
    public String attack() {
        return("Rrräugh!");
    }

    @Override
    public String defend() {
        return("Rrr!");
    }
}
