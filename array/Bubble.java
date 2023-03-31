package array;
import java.util.Arrays;

public class Bubble {
         public static void bubblesort(int arr[]){
                  int n=arr.length;
                  
                  for(int i=0;i<n-1;i++)
                  {
                           for(int j=0;j<n-i-1;j++){

                                    if(arr[j]>arr[j+1]){
                                             int temp=arr[j];
                                             arr[j]=arr[j+1];
                                          arr[j+1]=temp;
                                    }
                           }
                  }
         }

         public static void main(String[] args) {
                  
                  int arr[]  = {2,4,6,8,2,9,3};
                  bubblesort(arr);

                  //System.out.println(Arrays.toString(arr));
                  System.out.println(Arrays.toString(arr));

         }

         
}
