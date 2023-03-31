import java.util.Scanner;

public class Palindrome {
         public static void main(String[] args) {
                  System.out.println("Enter the positive   number");
                  Scanner  sc =new  Scanner(System.in);
                  int  n=  sc.nextInt();
                  int old   =n;
                  int  re =0;
                  sc.close();
                  while(old!=0)
                  {
                           re= (re*10)+(old%10);
                           old= old/10;
                  }

                  if(n==re)
                  System.out.println("number is plandrome");
                  else
                  System.out.println("Not a Panlidrome");
         }
}
