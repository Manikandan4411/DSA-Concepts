import java.util.Arrays;

public class ArrayBasics {

    // 1. Print all array elements
    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 2. Find the sum of array elements
    static int findSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    // 3. Find the largest element
    static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    // 4. Find the smallest element
    static int findSmallest(int[] arr) {
        int smallest = arr[0];

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    // 5. Search for an element (Linear Search)
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // 6. Count even numbers
    static int countEvenNumbers(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    // 7. Reverse an array in place
    static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // 8. Copy an array
    static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // 9. Find the average of array elements
    static double findAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        return (double) findSum(arr) / arr.length;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 30, 15, 40};

        System.out.println("Original Array:");
        displayArray(numbers);

        System.out.println("Sum: " + findSum(numbers));
        System.out.println("Largest: " + findLargest(numbers));
        System.out.println("Smallest: " + findSmallest(numbers));

        int target = 30;
        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println(target + " found at index: " + index);
        } else {
            System.out.println(target + " not found");
        }

        System.out.println("Even Numbers Count: "
                + countEvenNumbers(numbers));

        System.out.println("Average: " + findAverage(numbers));

        int[] copiedArray = copyArray(numbers);
        System.out.println("Copied Array:");
        displayArray(copiedArray);

        reverseArray(numbers);
        System.out.println("Reversed Array:");
        displayArray(numbers);
    }
}
