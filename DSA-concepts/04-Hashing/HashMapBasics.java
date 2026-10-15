import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        // Add key-value pairs
        marks.put("Arun", 85);
        marks.put("Ravi", 90);
        marks.put("Priya", 95);

        // Display the map
        System.out.println("Marks: " + marks);

        // Get a value
        System.out.println("Ravi's Marks: " + marks.get("Ravi"));

        // Check a key
        System.out.println("Contains Arun: " + marks.containsKey("Arun"));

        // Update a value
        marks.put("Arun", 88);

        // Remove a key
        marks.remove("Priya");

        // Display final map
        System.out.println("Updated Marks: " + marks);
    }
}