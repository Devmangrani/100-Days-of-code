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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght of Array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter Elements of an Array : ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
      // int arr[] = {41,25,53,124,355,575,59,56,42,12,5,2,52,547};
      System.out.println("Entered Array : " + Arrays.toString(arr));
      FindMaxMin(arr);
      //System.out.println("Entered Array : " + Arrays.toString(arr));
    }
}
