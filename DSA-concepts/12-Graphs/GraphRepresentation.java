public class GraphRepresentation {

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1},
            {1, 0, 0},
            {1, 0, 0}
        };

        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}