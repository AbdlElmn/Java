package Stacks;

public class Main {
    public static void main(String[] args) {
        System.out.println(ParStack.isValid("()"));
        System.out.println(ParStack.isValid("([{}])"));
        System.out.println(ParStack.isValid("(]"));
        System.out.println(ParStack.isValid("([)]"));
        System.out.println(ParStack.isValid("((("));

        /////////////////////////////////
        /// 
        /// 
        /// 

        String infix = "A+B*C-D/E";

        infixToPostFix obj = new infixToPostFix(infix.length());

        String postfix = obj.convert(infix);

        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
}
