public class CircularQueue {

    int[] queue = new int[5];
    int front = 0, rear = -1, size = 0;

    void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.dequeue();
        q.display();
    }
}