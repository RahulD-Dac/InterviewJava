import java.util.Scanner;

public class ReversNuber {
         public static void main(String[] args) {
                  System.out.println("enter  number");
                  Scanner sc = new Scanner(System.in);
                  int num = sc.nextInt();
                  sc.close();
                  int rev = 0;
                  int x;
                  while (num != 0) {

                           x = num % 10;
                           rev = rev * 10 + x;
                           num = num / 10;

                  }
                  System.out.println("Rever of number is " + rev);
         }
}
