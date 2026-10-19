import java.util.PriorityQueue;

public class MinHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(50);
        minHeap.add(20);

        System.out.println("Min Heap: " + minHeap);

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}