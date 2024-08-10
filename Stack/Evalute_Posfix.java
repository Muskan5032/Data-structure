import java.util.*;

public class Evalute_Posfix {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
         
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } 
         
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                int val2 = stack.pop();
                int val1 = stack.pop();
                
                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        
        // The result is the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a postfix expression: ");
        String expression = sc.nextLine();

        int result = evaluatePostfix(expression);
        System.out.println("The result of the postfix expression is: " + result);
    }
}
