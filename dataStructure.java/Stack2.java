public class Stack2 {
         public static boolean isBalanced(String str) {
                  int count = 0;
                  for (int i = 0; i < str.length(); i++) {
                           char c = str.charAt(i);
                           if (c == '(') {
                                    count++;
                           } else if (c == ')') {
                                    count--;
                                    if (count < 0) {
                                             return false;
                                    }
                           }
                  }
                  return count == 0;
         }

         public static void main(String[] args) {
                  String str = "(()))";
                  String str1 = "(())";
                  System.out.println(isBalanced(str));
                  System.out.println(isBalanced(str1));

         }
}
