import java.util.*;

public class GraphBasics {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, new ArrayList<>());
        graph.put(2, new ArrayList<>());
        graph.put(3, new ArrayList<>());

        // Add edges
        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(3);
        graph.get(3).add(1);

        System.out.println("Graph: " + graph);
    }
}