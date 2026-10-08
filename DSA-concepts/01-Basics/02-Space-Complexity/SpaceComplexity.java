public class SpaceComplexity {

    // O(1) - Constant Space
    static void constantSpace(int n) {
        int sum = 0;
        int count = 0;

        sum = n + 10;
        count++;

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }

    // O(n) - Linear Space
    static void linearSpace(int n) {
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }

        System.out.println("Array size: " + numbers.length);
    }

    // O(n^2) - Quadratic Space
    static void quadraticSpace(int n) {
        int[][] matrix = new int[n][n];

        System.out.println("Matrix size: "
                + matrix.length + " x " + matrix[0].length);
    }

    // O(log n) - Logarithmic Space
    static void logarithmicSpace(int n) {
        if (n <= 1) {
            return;
        }

        logarithmicSpace(n / 2);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("O(1) - Constant Space");
        constantSpace(n);

        System.out.println("\nO(n) - Linear Space");
        linearSpace(n);

        System.out.println("\nO(n^2) - Quadratic Space");
        quadraticSpace(n);

        System.out.println("\nO(log n) - Logarithmic Space");
        logarithmicSpace(n);

        System.out.println("Completed");
    }
}