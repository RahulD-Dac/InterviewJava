import java.util.Scanner;
import  java.util.*;
public class CounntDigit {

         public static void main(String[] args) {
                  Scanner  sc =new  Scanner(System.in);
                  int n=sc.nextInt();
                  int count=0;

                  sc.close();
                  while(n!=0){
                           n=n/10;
                           count++;
                  }
                  System.out.println("the count is = "+count);
         }
}
