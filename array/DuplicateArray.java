package array;

public class DuplicateArray {
         
        
         public static void findDuplicates(int[] arr) {
                  for (int i = 0; i < arr.length - 1; i++) {
                           for (int j = i + 1; j < arr.length; j++) {
                                    if (arr[i] == arr[j]) {
                                             System.out.println("Duplicate element found: " + arr[i]);
                                    }
                           }
                  }
         }

         public static void main(String[] args) {
                  int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9,9,10 };
                  findDuplicates(arr);

         }
}
