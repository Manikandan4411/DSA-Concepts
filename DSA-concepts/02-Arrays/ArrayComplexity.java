public class ArrayComplexity {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // O(1) - Access an element
        System.out.println("First Element: " + arr[0]);

        // O(n) - Traverse the array
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // O(n) - Search for an element
        int target = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("\nElement Found: " + found);

        // O(n^2) - Nested loops
        System.out.println("All Pairs:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
}
