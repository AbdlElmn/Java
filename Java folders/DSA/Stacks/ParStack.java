package Stacks;

public class ParStack {
    public static boolean isValid(String s) {
        CharStack stack = new CharStack(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '['))
                    return false;
            }

        }
        return stack.isEmpty();
    }

}