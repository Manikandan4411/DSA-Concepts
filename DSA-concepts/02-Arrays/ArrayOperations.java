import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // 1. Display array
        System.out.println("Array: " + Arrays.toString(arr));

        // 2. Access an element
        System.out.println("First Element: " + arr[0]);

        // 3. Update an element
        arr[1] = 25;
        System.out.println("After Update: " + Arrays.toString(arr));

        // 4. Insert an element (create a new array)
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = 60;
        System.out.println("After Insert: " + Arrays.toString(newArr));

        // 5. Search for an element
        int target = 30;
        int index = -1;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Search Index: " + index);

        // 6. Delete an element at index 1
        int deleteIndex = 1;
        int[] result = new int[newArr.length - 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i != deleteIndex) {
                result[j++] = newArr[i];
            }
        }

        System.out.println("After Delete: " + Arrays.toString(result));
    }
}