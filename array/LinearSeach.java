package array;

import java.util.Scanner;

public class LinearSeach {
      public static int linearSeach(int array[], int key) {
            for (int i = 0; i < array.length; i++) {
                  if (array[i] == key) {
                        return i;
                  }         
               }
            return -1;
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Key");            int key = sc.nextInt();

            int array[] = { 0, 1, 3, 4, 6, 7, 83, 4, 3 };
            int result = linearSeach(array, key);

            if (result == -1) {
                  System.out.println("Element  not  found ");

            } else {
                  System.out.println("Element found at in index " + result);
            }

      }
}
