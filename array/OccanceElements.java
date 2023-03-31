package array;

public class OccanceElements {

         // Count occurrences of each element in an array| //////////

         public static void main(String[] args) {
                  int[] arr = { 1, 2, 3, 2, 4, 1, 5, 1 };
                  int[] freq = new int[arr.length];
                  for (int i = 0; i < arr.length; i++) {
                           int count = 1;
                           for (int j = i + 1; j < arr.length; j++) {
                                    if (arr[i] == arr[j]) {
                                             count++;                                             // mark the element as visited by assigning -1
                                             freq[j] = -1;
                                    }
                           }
                           if (freq[i] != -1) {
                                    freq[i] = count;
                           }
                  }
                  for (int i = 0; i < freq.length; i++) {
                           if (freq[i] != -1) {
                                    System.out.println(arr[i] + " occurs " + freq[i] + " times.");
                           }
                  }
         }
}