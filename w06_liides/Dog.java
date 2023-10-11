import java.util.Random;

public class Dog implements Animal{
    public String name;

    public Dog(String name){
        name = this.name;
    }

    @Override
    public String speak() {
        String call = "Koer haugub!";
        return call;
    }

    @Override
    public String eat() {
        Random r = new Random();
        String[] food = new String[]{"sööb", "rikub mööbli ära", "rikub vaiba ära"};
        return ("Koer "+food[r.nextInt(3)]+"!");
    }

    @Override
    public String sleep() {
        return("Koer magab!");
    }

    @Override
    public String beSneaky() {
        return("*Auh auh auh*");
    }

    @Override
    public String lookAround() {
        return("Koer vaatab ringi!");
    }

    @Override
    public String attack() {
        return("Rrraughhh!");
    }

    @Override
    public String defend() {
        return("Grrr!");
    }
}
