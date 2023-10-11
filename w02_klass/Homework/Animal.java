public class Animal{
    private String gender;
    private String name;
    
    public String species;

    public Animal(String animalName, String species, String gender) {
        this.species = species;
        this.gender = gender;
        System.out.println("Võtsid uue looma!");
    }
    public void setName(String name){
        this.name = name;
        System.out.println("Muutsid looma nime!");
    }
    public String getName(){
        return this.name;
    }
    public String getSpecies(){
        return this.species;
    }
    public String getGender(){
        return this.gender;
    }
}