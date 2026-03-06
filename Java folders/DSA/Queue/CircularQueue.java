package Queue;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int s) {
        this.size = s;
        queue = new int[s];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    public void enqueue(int n) {
        if (isFull()) {
            System.err.println("Queue is full.");
            return;
        }
        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = n;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is Empty.");
            return;
        }
        // only one element
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % size;

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
