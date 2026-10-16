public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev;
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
        second.prev = first;

        second.next = third;
        third.prev = second;

        Node current = first;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}