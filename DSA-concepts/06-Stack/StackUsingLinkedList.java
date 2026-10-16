public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Removed: " + top.data);
        top = top.next;
    }

    void display() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.display();
    }
}