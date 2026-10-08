```java
public class TimeComplexity {

    // O(1) - Constant Time
    static void constantTime(int[] arr) {
        System.out.println(arr[0]);
    }

    // O(n) - Linear Time
    static void linearTime(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(n^2) - Quadratic Time
    static void quadraticTime(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // O(log n) - Logarithmic Time
    static void logarithmicTime(int n) {
        int i = 1;

        while (i < n) {
            System.out.println(i);
            i = i * 2;
        }
    }

    // O(n log n) - Linearithmic Time
    static void linearithmicTime(int n) {
        for (int i = 0; i < n; i++) {
            int j = 1;

            while (j < n) {
                System.out.println(i + " " + j);
                j = j * 2;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int n = 5;

        System.out.println("O(1) - Constant Time");
        constantTime(arr);

        System.out.println("\nO(n) - Linear Time");
        linearTime(n);

        System.out.println("\nO(n^2) - Quadratic Time");
        quadraticTime(n);

        System.out.println("\nO(log n) - Logarithmic Time");
        logarithmicTime(n);

        System.out.println("\nO(n log n) - Linearithmic Time");
        linearithmicTime(n);
    }
}
```