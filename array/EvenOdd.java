package array;
import java.util.Scanner;

public class EvenOdd {
         public static void main(String[] args) {

                  System.out.println("Enter the array size ");
                  Scanner sc = new Scanner(System.in);
                  int size = sc.nextInt();
                  int arr[] = new int[size];
                  System.out.println("Enter the array elements ");

                  for (int i = 0; i < size; i++) {
                           arr[i] = sc.nextInt();
                  }
                  for (int i = 0; i < size; i++) {
                           if (arr[i] % 2 == 0) {
                                    System.out.println(arr[i]);
                           } else {
                                    System.out.println("Odd number: " + arr[i]);
                           }
                  }

         }
}
