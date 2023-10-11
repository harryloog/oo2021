public class Son extends Parent{

    public Son(String name, String dream) {
        super(name, dream);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void firstThingToDo() {
        // TODO Auto-generated method stub
        super.firstThingToDo();
        System.out.println("I watch TV");

    }
    
    @Override
    public void howISpendMyEvenings() {
        System.out.println("I play with cars");
        
    }
    
}
