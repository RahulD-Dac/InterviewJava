import java.util.Scanner;

public class arstrong {
         static int power(int rem, int n) {
                  int p = 1;
                  for (int i = 1; i <= n; i++)
                           p = p * rem;
                  return p;
         }         static int counter(int num) {
                  int count = 0;
                  while (num > 0) {
                           count++;            num = num / 10;
                  }
                  return count;
         }         public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter number");            int num = sc.nextInt();
                  int temp = num;                     sc.close();
                  int arm = 0;
                  int digit = counter(num);                      int rem = 0;
                  while (num > 0) {
                           rem = num % 10;                           // arm = arm + (int) Math.pow(rem, digit);
                           arm = arm + power(rem, digit);
                           num = num / 10;
                  }

                  if (temp == arm) {
                           System.out.println("enter numberis armstrong number");

                  } else {
                           System.out.println("enter number is not armstrong number");
                  }

         }

}
