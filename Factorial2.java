import java.util.Scanner;

public class Factorial2 {
  public static void main(String[] args){
         Scanner sc =  new Scanner(System.in);
         System.out.println("Enter  number  :");
         int  n = sc.nextInt();
         int  fact  =fact(n);
         System.out.println("the factorial"+n+"is :"+fact   );

  }

  public static int fact(int  n) {
         if (n==0){
                  return  1;

         }
         else{
                  return n * fact(n-1);
         }
}
}


       