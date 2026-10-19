import java.util.PriorityQueue;

public class PriorityQueueBasics {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);

        System.out.println("Smallest: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Next smallest: " + queue.peek());
    }
}