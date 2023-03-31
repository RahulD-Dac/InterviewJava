public class Vowel1 {
   
                  public static void main(String[] args) {
                           String input = "cfdwsqkkk";
                           int vowelCount = 0;
                           for (int i = 0; i < input.length(); i++) {
                                    char c = input.charAt(i);
                                    if (isVowel(c)) {
                                             vowelCount++;
                                    }
                           }
                           System.out.println("The number of vowels in the string \"" + input + "\" is: " + vowelCount);
                  }

                  public static boolean isVowel(char c) {
                           return "AEIOUaeiou".indexOf(c) != -1;
                   
         }

}
