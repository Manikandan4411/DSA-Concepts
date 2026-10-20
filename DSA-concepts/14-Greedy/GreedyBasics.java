import java.util.Arrays;

public class GreedyBasics {

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 36;
        int count = 0;

        // Start with the largest coin
        Arrays.sort(coins);

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
                System.out.println("Selected coin: " + coins[i]);
            }
        }

        System.out.println("Total coins used: " + count);
        System.out.println("Remaining amount: " + amount);
    }
}