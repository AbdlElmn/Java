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

    public int sum() {
        int sum = 0;
        Node temp = head;

        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }

        return sum;
    }

    public int max() {
        if (head == null) {
            System.out.println("List is empty");
        }

        int max = head.data;
        Node temp = head.next;

        while (temp != null) {
            if (temp.data > max)
                max = temp.data;

            temp = temp.next;
        }

        return max;
    }

    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {

            if (key == temp.data)
                return true;

            temp = temp.next;
        }

        return false;
    }

    public void sortedInsertASC(int data) {
        Node newNode = new Node(data);

        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data < data) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void sortASC() {

        if (head == null || head.next == null) {
            return; // already sorted
        }

        Node current;
        Node index;
        int temp;

        for (current = head; current != null; current = current.next) {

            for (index = current.next; index != null; index = index.next) {

                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    public void sortedInsertDESC(int data) {
        Node newNode = new Node(data);

        if (head == null || data > head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data > data) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void sortDESC() {

        if (head == null || head.next == null) {
            return; // already sorted
        }

        Node current;
        Node index;
        int temp;

        for (current = head; current != null; current = current.next) {

            for (index = current.next; index != null; index = index.next) {

                if (current.data < index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    public void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next.data != value && temp.next != null) {
            temp = temp.next;

        }
        if (temp.next == null) {
            System.out.println("Value not found.");
            return;
        }
        temp.next = temp.next.next;

    }

    public void deleteFirst() {

    }

    public void deleteLast() {

    }

}
