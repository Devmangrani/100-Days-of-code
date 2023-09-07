import java.util.Scanner;
import java.util.Arrays;

public class Day94 {
    public static void FindMaxMin(int arr[]) {
        //Find the maximum and minimum element in an Array
       if(arr == null || arr.length == 0) return;
       int min = arr[0];
       int max = arr[0];
       for(int i = 1; i < arr.length; i++){
        /* if(arr[i] <min){
            min = arr[i];
        }
        if(arr[i] >max){
            max = arr[i];
        } */
        // Alt + Shift + A
        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]);
        
       }
       System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
    public static void FindKth() {
        //Find Kth Element of an Array
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght of Array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter Elements of an Array : ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
      System.out.println("Entered Array : " + Arrays.toString(arr));
      FindMaxMin(arr);

      //Find kth min & max element of an Array
      //int arr[] = {1,2,6,93,87,23};
      int k = 3;// here we take kth minimum element
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      System.out.println(arr[k]);
    }
}
