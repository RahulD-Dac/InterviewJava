import java.util.Scanner;

public class Factorial {

         public static void main(String[] args) {
                  System.out.println("Enter the non-negative number of  facts  to  calculate ");
                  Scanner sc = new Scanner(System.in);

                  int n = sc.nextInt();
                  int fact = 1;

                  for (int i = 2; i <= n; i++) {
                           fact *= i;

                  }

                  System.out.println(n + "! = " + fact);

         }

}
