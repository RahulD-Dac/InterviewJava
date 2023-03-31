import java.util.*;

public class Stack1 {
    static boolean isbalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {               
                    char top = stack.peek();
                                      if (c == '}' && top == '{' ||
                            c == ')' && top == '(' ||
                            c == ']' && top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paraenthiss ");
        String str = sc.nextLine();
        boolean x = isbalanced(str);
        System.out.println(x);

    }
}