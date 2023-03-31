public class ReverseSring1 {
         public static void main(String[] args) {
                  String s = "rafhul arse";
                  String rev = " ";

                  for (int i = s.length() - 1; i >= 0; i--) {
                           rev = rev + s.charAt(i);

                  }
                  System.out.println("string   is " + s);

                  System.out.println("string revser is "+rev);
         }

}
