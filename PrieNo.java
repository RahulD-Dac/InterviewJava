import java.util.Scanner;

public class PrieNo {
         // Check given number is prime or not
         public static void main(String[] args) {
                  System.out.println("Enter a number to check: ");
                                    Scanner sc = new Scanner(System.in);
                  int num = sc.nextInt();
                  sc.close();
                  int count = 0;
                                    for (int i = 1; i <= num; i++) {
                           if (num % i == 0) {
                                    count++;
                           }             }
                  if (count == 2) {
                           System.out.println("number  is  prime number");
                  } else {
                           System.out.println("number is not prime number");
                  }

         }

}
