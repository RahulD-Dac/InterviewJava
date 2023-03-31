import java.util.*;
public class HappyNumber {
         public static boolean isHappy(int n) {
                  Set<Integer> inLoop = new HashSet<Integer>();
                  int squareSum, remain;
                  while (inLoop.add(n)) {    squareSum = 0;
                           while (n > 0) {
                                    remain = n % 10;   
                                     squareSum += remain * remain;           n /= 10;                           }
                           if (squareSum == 1)               return true;
                           else
                                    n = squareSum;               
                              }
                  return false;        }
                 public static void main(String[] args) {
                  System.out.println("Enter the number ");
                  Scanner sc = new Scanner(System.in);
                  int num = sc.nextInt();                  sc.close();
                  boolean result = isHappy(num);
                  if (result) {
                           System.out.println("Number is happy number");
                  } else {
                           System.out.println("Number is unhappy number");

                  }

         }

}
