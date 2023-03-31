package array;

public class FindSumisEqulTonuber {

         public static void findPairs(int[] arr, int sum) {
                  int n = arr.length;
                  for (int i = 0; i < n; i++) {
                           for (int j = i + 1; j < n; j++) {
                                    if (arr[i] + arr[j] == sum) {
                                             System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                                    }
                           }
                  }
         }
         public static void main(String[] args) {

                  int[] arr = { 1, 2, 3, 4, 5 };
                  int sum = 7;
                  findPairs(arr, sum);

         }
}
