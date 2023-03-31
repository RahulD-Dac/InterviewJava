package array;
import java.util.Scanner;

public class SumArray {

         public static void main(String[] args) {
                  System.out.println("enter array size ");

                  // int arr[]={1,1,2,3,4,4};
                  Scanner sc = new Scanner(System.in);
                  int n = sc.nextInt() ;
                  int [] arr=new int[n];

                  int arrsum = 0;
System.out.println("enter element of array");

         for(int i=0; i<n; i++)     {
                  arr[i] = sc.nextInt();
                  arrsum+=arr[i];
         }
   
                  System.out.println("the array sum is ="+arrsum);
         }
         
}
