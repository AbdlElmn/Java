package Stacks;

public class CharStack {

    private char[] stack;
    private int size;
    private int top;

    public CharStack(int s) {
        this.size = s;
        stack = new char[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(char c) {
        if (isFull()) {
            System.err.println("Stack is full");
            return;
        }
        stack[++top] = c;
    }

    public char pop() {
        if (isEmpty()) {
            System.err.println("Stack is Empty");
            return '-';
        }
        return stack[top--];
    }

    public char peek() {
        if (isEmpty()) {
            return '-';
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