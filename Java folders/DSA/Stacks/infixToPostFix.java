package Stacks;

public class infixToPostFix {

    private char[] stack;
    private int size;
    private int top;

    public infixToPostFix(int s) {

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
            return '\0';
        }
        return stack[top--];
    }

    public char peek() {
        if (isEmpty())
            return '\0';
        return stack[top];
    }

    public static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static int precendence(char operator) {
        if (operator == '+' || operator == '-')
            return 1;

        if (operator == '*' || operator == '/')
            return 2;

        if (operator == '^')
            return 3;

        return 0;
    }

    public String convert(String inFix) {
        String postFix = "";
        for (int i = 0; i < inFix.length(); i++) {
            char c = inFix.charAt(i);
            if (isOperand(c)) {
                postFix += c;
            } else if (isOperator(c)) {
                while (!!isEmpty() && isOperator(peek()) && (precendence(peek()) >= precendence(c))) {
                    postFix += pop();
                }
                push(c);
            }
        }
        while (!isEmpty()) {
            postFix += pop();
        }
        return postFix;
    }
}
