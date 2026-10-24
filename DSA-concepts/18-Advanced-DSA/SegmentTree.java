public class SegmentTree {

    int[] tree;
    int n;

    SegmentTree(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];
        build(arr, 1, 0, n - 1);
    }

    void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        build(arr, node * 2, start, mid);
        build(arr, node * 2 + 1, mid + 1, end);

        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    int sum(int node, int start, int end, int left, int right) {
        if (right < start || left > end) {
            return 0;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        return sum(node * 2, start, mid, left, right)
             + sum(node * 2 + 1, mid + 1, end, left, right);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        SegmentTree st = new SegmentTree(arr);

        System.out.println("Range sum: " + st.sum(1, 0, 3, 1, 3));
    }
}