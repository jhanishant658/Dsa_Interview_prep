

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); 
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            
            // Use a switch statement to catch operators; anything else is a number
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int subRight = stack.pop();
                    int subLeft = stack.pop();
                    stack.push(subLeft - subRight);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divRight = stack.pop();
                    int divLeft = stack.pop();
                    stack.push(divLeft / divRight);
                    break;
                default:
                    // If it's not an operator, safely convert the string to a negative or positive integer
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.peek();
    }
}