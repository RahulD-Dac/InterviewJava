import java.util.Scanner;

public class PalindromeString1 {
        public static boolean isPalindrome(String str) {
                // to remove lowercase and spaces
                str = str.toLowerCase().replace(" ", "");
                char[] arr = str.toCharArray();
                int i = 0;                int j = arr.length - 1;
                while (i < j) {
                        if (arr[i] != arr[j]) {
                                return false;
                                                }
                        i++;  j--;
                }               return true;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Name");
                String str = sc.nextLine();
                sc.close();
                System.out.println(isPalindrome(str));
                // System.out.println(isPalindrome("race"));

        }
}
