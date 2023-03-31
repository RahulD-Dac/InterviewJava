import java.util.Scanner;

public class PalindromeString {
         public static boolean isPalindrome(String  str) {
        //to  remove lowercase and spaces
                 str= str.toLowerCase().replace(" ",""); 
                 StringBuilder   sb = new StringBuilder(str);
                 sb.reverse();
                 return sb.toString().equals(str);        
         }      

         public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the Name");
                  String str=sc.nextLine();


                  sc.close();
                  System.out.println(isPalindrome(str));
                 // System.out.println(isPalindrome("race"));

         }
}
