import java.util.*;

public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Infix Expression:");
        String infix = sc.nextLine();
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix Expression: " + prefix);
    }

    public static String infixToPrefix(String infix) {
        // Step 1: Reverse the infix expression
        String reversedInfix = reverseInfix(infix);

        // Step 2: Convert the reversed infix expression to postfix
        String postfix = infixToPostfix(reversedInfix);

        // Step 3: Reverse the postfix expression to get prefix
        return reverseString(postfix);
    }

    public static String reverseInfix(String infix) {
        StringBuilder reversed = new StringBuilder();
        for (int i = infix.length() - 1; i >= 0; i--) {
            char ch = infix.charAt(i);
            if (ch == '(') {
                reversed.append(')');
            } else if (ch == ')') {
                reversed.append('(');
            } else {
                reversed.append(ch);
            }
        }
        return reversed.toString();
    }

  
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); 
            } else { 
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

      
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
