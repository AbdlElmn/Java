package LinkedLists;

public class CircularLinkedList {
    Node head = null;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

    }

    public void insertAtBegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void insertAtIndex(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            insertAtBegining(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Invalid position");
                return;
            }

        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

}
