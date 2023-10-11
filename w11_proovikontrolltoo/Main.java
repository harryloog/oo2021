import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Character> characters = Arrays.asList('a', 'b', 'c');
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);

        List<String> emptyStrings = new ArrayList();

        System.out.println(
            Generics.getFirst(strings) + " " + 
            Generics.getFirst(integers) + " " + 
            Generics.getFirst(characters) + " " + 
            Generics.getFirst(doubles) + " " + 
            Generics.getFirst(emptyStrings)
        );

        Generics.printList(strings);
        System.out.println("Sum of integers is " + Generics.sumOfList(integers));
        Generics.lowerBound(integers);

        /* List<Long> longList = new ArrayList<>();
        longList.add(10L);
        Generics.lowerBound(longList); */

        SimplePair<Integer, String> pair = new SimplePair<Integer, String>(5,"smth");
        
        System.out.println(pair.getKey()+" "+pair.getValue());
        
        SimplePair<Integer, SimplePair<Integer, String>> pair2 = new SimplePair<>(1, new SimplePair<>(2, "Nested"));

        System.out.println(pair2.getKey() + "\n\t" + pair2.getValue().getKey() + ": " + pair2.getValue().getValue());

        System.out.println(
            Generics.getType(1) + " " +
            Generics.getType("Kaarel") + " "
        );



    }
}