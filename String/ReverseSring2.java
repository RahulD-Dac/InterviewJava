public class ReverseSring2 {
         public static String reverseString(String str) {
                  if (str.isEmpty()) {
                           return str;
                  } else {
                           return reverseString(str.substring(1)) + str.charAt(0);
                  }
         }

         public static void main(String[] args) {
                  String original = "hello world";
                  String reversed = reverseString(original);
                  System.out.println(reversed);

         }
}
