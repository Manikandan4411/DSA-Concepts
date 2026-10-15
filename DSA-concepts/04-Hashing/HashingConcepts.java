import java.util.HashMap;
import java.util.Map;

public class HashingConcepts {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10};

        // Count the frequency of each number
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : numbers) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("Number Frequencies: " + frequency);

        // Check whether a number exists
        int target = 20;
        System.out.println("Contains 20: " + frequency.containsKey(target));
    }
}