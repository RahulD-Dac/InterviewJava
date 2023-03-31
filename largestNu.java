public class largestNu {

         public static void main(String[] args) {
                  int a=10;
                  int b=12;
                  int c=81;

                           // if(a>b&&a>c) {
                           //          System.out.println("largest is A");
                           // }
                           // else if(b>c){
                           //          System.out.println("largest is b");
                           // }
                           // else{
                           //          System.out.println("largest is c");

                           // }
                 String str = b>a&&b>c ?"b is largest":a>b&&a>c?"a is lagest":"c is lagest";
         System.out.println(str);
         
         }
}
