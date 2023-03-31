 
public class VowelSwitch {

public static void main(String[] args) {
         String input= "hello world";

         int vowelCount = 0;
         for (int i=0; i<input.length(); i++) {
         char c = input.charAt(i);
         switch(c) {
         case  'A':         case 'a':         case 'e':         case  'E':         case 'i':         case 'I':
         case  'o':         case 'O':
         case 'u':         case  'U':
         vowelCount++;
         break;
         default:
         break;

         }
}
System.out.println("vowelCount is " + vowelCount);
}

}
   
              