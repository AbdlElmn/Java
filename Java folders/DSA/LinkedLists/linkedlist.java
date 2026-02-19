package LinkedLists;

public class linkedlist {
    Node head;

    public void Display() {
        Node temp = head;
        System.out.print("Head -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public void insertAtBegining(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null)
            head = newNode;

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

    }

    public void insertAtindex(int data, int index) {
        if (index == 0) {
            insertAtBegining(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int count() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    
}
