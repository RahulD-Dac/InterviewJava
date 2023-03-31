import java.util.Scanner;

public class GCD_LCM {
         public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the first number : ");                  int  num1=sc.nextInt();
                  System.out.println("Enter the second number");                  int  num2=sc.nextInt();
                  int lcm =findLcm(num1,num2);
                  System.out.println("Enter thenumber LCM IS "+lcm);
         }
         public static  int findLcm(int num1,int num2) {
                  int gcd=findGCD(num1,num2);
                  int product= num1*num2;
                  return product/gcd ;
         }

         public static int findGCD(int num1,int num2) {
                  if(num2==0)
                  {                           return  num1;
                  }
                  else{               return findGCD(num2, num1%num2);
                  }


         }

}
