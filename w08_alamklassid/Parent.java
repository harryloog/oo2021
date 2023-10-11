public abstract class Parent {
    public String name = "default";
    public String dream;
    // mõelge kolmas välja

    public Parent(String name, String dream){
        this.name = name;
        this.dream = dream;

    }

    public void favouriteHobbyIs(String hobby){
    System.out.println(this.name +"'s favourtie hobby is " + hobby);
    }

    public void firstThingToDo(){
        System.out.println("I brush my teeth");
    }

    public abstract void howISpendMyEvenings();

    //Kirjutage uus klass mis extendib Patrentit.
    //kasutage super keywordi, kas konstruktoris
// või meetodis


}
