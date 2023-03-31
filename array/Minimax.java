package array;

public class Minimax {
         public static void findMinMax(int[] arr) {
                  if (arr.length == 0) {
                           System.out.println("Array is empty.");
                           return;
                  }
                  int min = arr[0];                    int max = arr[0];
                  for (int i = 1; i < arr.length; i++) {
                           if (arr[i] < min) {
                                    min = arr[i];
                           }
                           if (arr[i] > max) {
                                    max = arr[i];
                           }
                  }
                  System.out.println("Minimum value: " + min);
                  System.out.println("Maximum value: " + max);
         }
         public static void main(String[] args) {
                  int[] arr = { 5, 2, 9, 1, 7, 4, 6 };
                  findMinMax(arr);

         }
}
