import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate ignored

        // Display unique elements
        System.out.println("Numbers: " + numbers);

        // Check an element
        System.out.println("Contains 20: " + numbers.contains(20));

        // Remove an element
        numbers.remove(30);

        // Display updated set
        System.out.println("Updated Numbers: " + numbers);

        // Count elements
        System.out.println("Size: " + numbers.size());
    }
}