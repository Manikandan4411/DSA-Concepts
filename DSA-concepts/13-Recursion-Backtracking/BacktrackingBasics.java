public class BacktrackingBasics {

    static void findSubsets(int[] arr, int index, String result) {
        if (index == arr.length) {
            System.out.println(result);
            return;
        }

        // Include the current element
        findSubsets(arr, index + 1, result + arr[index] + " ");

        // Exclude the current element
        findSubsets(arr, index + 1, result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("All subsets:");
        findSubsets(arr, 0, "");
    }
}