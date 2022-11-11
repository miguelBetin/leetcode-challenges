import java.util.EmptyStackException;
import java.util.Stack;

public class validParentheses {

    public static void main(String[] args) {

        System.out.println(isValidParentheses("){"));


    }

    public static boolean isValidParentheses(String s) {

        boolean valid = true;
        Stack<String> stack = new Stack<>();

        if (s.length() > 0 && s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {

                String currentChar = s.substring(i, i + 1);
                try {
                    switch (currentChar) {

                        case "(":
                        case "{":
                        case "[": {
                            stack.push(currentChar);
                            break;
                        }
                        case "}": {
                            if (!stack.peek().equalsIgnoreCase("{")) {
                                valid = false;
                            } else {
                                stack.pop();
                            }

                            break;
                        }
                        case "]":
                            if (!stack.peek().equalsIgnoreCase("[")) {
                                valid = false;
                            } else {
                                stack.pop();
                            }

                            break;
                        case ")":
                            if (!stack.peek().equalsIgnoreCase("(")) {
                                valid = false;
                            } else {
                                stack.pop();
                            }
                            break;
                    }

                } catch (EmptyStackException e) {
                    valid =false;
                }
            }

            if (!stack.empty()) valid = false;

        } else {
            valid =false;
        }

        return valid;
    }
}
