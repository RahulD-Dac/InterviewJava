package array;

public class EqulityArray {
         public static boolean areArraysEqual(int[] arr1, int[] arr2) {
                  if (arr1.length != arr2.length) {
                           return false;
                  }
                  for (int i = 0; i < arr1.length; i++) {
                           if (arr1[i] != arr2[i]) {
                                    return false;
                           }
                  }                  return true;
         }
         public static void main(String[] args) {                  
                  int[] a = { 1, 2, 3 };
                  int[] b = { 1, 2, 3 };
                  int[] c = { 1, 2, 4 };

                  System.out.println(areArraysEqual(a, b)); // true
                  System.out.println(areArraysEqual(a, c)); // false

         }

}
