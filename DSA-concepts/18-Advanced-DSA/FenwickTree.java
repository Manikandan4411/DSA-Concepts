public class FenwickTree {

    int[] tree;
    int n;

    FenwickTree(int n) {
        this.n = n;
        tree = new int[n + 1];
    }

    void update(int index, int value) {
        while (index <= n) {
            tree[index] += value;
            index += index & -index;
        }
    }

    int sum(int index) {
        int result = 0;

        while (index > 0) {
            result += tree[index];
            index -= index & -index;
        }

        return result;
    }

    public static void main(String[] args) {
        FenwickTree ft = new FenwickTree(5);

        ft.update(1, 10);
        ft.update(2, 20);
        ft.update(3, 30);

        System.out.println("Prefix sum: " + ft.sum(3));
    }
}