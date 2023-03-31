public class GCD {

         public static void main(String[] args) {

                  int num1 = 24;
                  int num2 = 36;

                  int gcd = findgcd(num1, num2);
                  System.out.println("Gcd=== " + gcd);

         }

         public static int findgcd(int num1, int num2) {
                  if (num2 == 0) {
                           return num1;
                  }
                  return findgcd(num2, num1 % num2);

         }

}
