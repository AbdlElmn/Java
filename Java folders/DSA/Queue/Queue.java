package Queue;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue(int s) {
        this.size = s;
        queue = new int[s];
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (rear == size - 1)
            return true;
        else
            return false;
    }

    public void enqueue(int n) {
        if (isFull()) {
            System.err.println("Queue is full.");
            return;
        }
        if (front == -1)
            front = 0;

        queue[++rear] = n;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is Empty.");
            return;
        }
        front++;
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    public int first() {
        if (isEmpty()) {
            System.err.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    public int last() {
        if (isEmpty()) {
            System.err.println("Queue is empty.");
            return -1;
        }
        return queue[rear];
    }

}
