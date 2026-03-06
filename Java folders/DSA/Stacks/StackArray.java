package Stacks;

public class StackArray {
    private int[] stack;
    private int size;
    private int top;

    public StackArray(int s) {
        this.size = s;
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int n) {
        if (isFull()) {
            System.err.println("Stack is full");
            return;
        }
        stack[++top] = n;
    }

    public int pop() {
        if (isEmpty()) {
            System.err.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
