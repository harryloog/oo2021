public class Homework {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < args.length; i++);{ // for (int i = 0; i < args.length; i++);{
            numbers[i] = Integer.parseInt(args[i]); // System.out.println(args[i]);
        }
        if (numbers.length != 0) {
            System.out.println("Leiame, kas arv on paaris või paaritu");
            System.out.println("Arv on: ");
            System.out.println(numbers[0]);
            System.out.println();
            if (numbers[0] % 2 == 1) {
                System.out.println("Arv on paaritu.");
            } else {
                System.out.println("Arv on paaris.");
            }
        }
    }
}
