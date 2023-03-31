import java.util.Scanner;

public class PalindromeString2 {         

         public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the Name");
                  String str=sc.nextLine();
                String nstr="";
                  sc.close();
                  char[]ch= str.toCharArray();
                  for(int i=0; i<ch.length/2; i++)
                  {                        char c=ch[i];
                        ch[i]=ch[ch.length-i-1];
                        ch[ch.length-i-1]=c;
                  }
                  nstr= new String(ch);
                  if(nstr.equalsIgnoreCase(str)){
                        System.out.println("string is palindrome");
                  }                  else{
                        System.out.println("string is not palindrome");
                  }
                 // System.out.println(isPalindrome("race"));

         }
}
