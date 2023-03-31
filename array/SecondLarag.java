package array;

import java.util.Scanner;

public class SecondLarag {
         public static void main(String[] args) {               
                  System.out.println("Enter the array size ");
                  Scanner sc= new Scanner(System.in);
                  int size= sc.nextInt()     ;
                  int arr[] = new int[size];
                  System.out.println("Enter the array elements ");
                  for(int i=0; i<size; i++)
                  {
                        arr[i]=sc.nextInt();
                  }                  // int[] arr = {5, 2, 7, 3, 9, 8};
                  int max1 =Integer.MIN_VALUE;  //it provide min value 
                  int max2 =Integer.MIN_VALUE;
                  for(int i=0;i<size;i++)    {
                           if(arr[i]>max1){ //max1<5 true
                                    max2=max1;  //max1 save in max2
                                    max1     = arr[i];  //5 save in max1
                           }
                           else if(arr[i]>max2 && arr[i]!=max1){
                                    max2=arr[i];
                           }
                  }
                  if (max2 == Integer.MIN_VALUE) {
                           System.out.println("There is no second largest element in the array.");
                  } else {
                           System.out.println("The second largest element in the array is: " + max2);
                  }

         }
         
}
