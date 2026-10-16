public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        third.next = first; // Connect last node to first

        Node current = first;
        int count = 0;

        while (count < 3) {
            System.out.print(current.data + " ");
            current = current.next;
            count++;
        }
    }
}