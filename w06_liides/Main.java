public class Main {
    public static void main(String[] args) {
        EstonianID estonian = new EstonianID("39608240216");

        System.out.println("Sugu on:"+estonian.getGender());
        System.out.println("Sünniaasta on :"+estonian.getFullYear());
        System.out.println("Sünnikuupäev on :"+estonian.getDOB());
        System.out.println("Vanus on :"+estonian.getAge());
        System.out.println("Sünnikuu on :"+estonian.getMonth());
        System.out.println("Sünnipäev on :"+estonian.getDay());
        System.out.println("Järgmise sünnipäevani on :"+estonian.untilNextBirthday());

        FinnishID finnish = new FinnishID("230181-237J");

        System.out.println("Sugu on:"+finnish.getGender());
        System.out.println("Sünniaasta on :"+finnish.getFullYear());
        System.out.println("Sünnikuupäev on :"+finnish.getDOB());
        System.out.println("Vanus on :"+finnish.getAge());
        System.out.println("Sünnikuu on :"+finnish.getMonth());
        System.out.println("Sünnipäev on :"+finnish.getDay());
        System.out.println("Järgmise sünnipäevani on :"+finnish.untilNextBirthday());

        Cat cat = new Cat("Miisu");
        
        System.out.println(cat.speak());
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        System.out.println(cat.beSneaky());
        System.out.println(cat.lookAround());
        System.out.println(cat.attack());
        System.out.println(cat.defend());

        Dog dog = new Dog("Miika");
        
        System.out.println(dog.speak());
        System.out.println(dog.eat());
        System.out.println(dog.sleep());
        System.out.println(dog.beSneaky());
        System.out.println(dog.lookAround());
        System.out.println(dog.attack());
        System.out.println(dog.defend());
    }
}
