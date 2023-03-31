package array;

import java.util.Scanner;

public class Binarysearch {
         public static int BinarySeach(int array[], int key) {
                  int low = array[0];
                  int high = array.length - 1;

                  while (low <= high) {
                           int mid = (low + high) / 2;
                           if (array[mid] == key) {
                                    return mid;
                           } else if (array[mid] > key) {
                                    high = mid - 1;
                           } else {
                                    low = mid + 1;
                           }
                  }
                  return -1;

         }

         public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter Key");
                  int key = sc.nextInt();

                  int array[] = { 0, 1, 3, 4, 6, 7, 83, 4, 3 };
                  int result = BinarySeach(array, key);

                  if (result == -1) {
                           System.out.println("Element  not  found ");

                  } else {
                           System.out.println("Element found at in index " + result);
                  }

         }

}
