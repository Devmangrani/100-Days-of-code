import java.util.Arrays;
import java.util.Scanner;

public class Day99 {
   
    public static int Ascorder(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        if (isAsc) {
            isAsc = true;
        }else {
            isAsc = false;
        }
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if (isAsc) {
                if (arr[mid]<key) {
                    start = mid + 1;
    
                }else {
                    end = mid-1;
                }
            }else {
                if (arr[mid]>key) {
                    start = mid - 1;
    
                }else {
                    end = mid + 1;
                }
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of Array : ");
        int lenght = sc.nextInt();
        int arr[] = new int [lenght];
        System.out.println("Enter elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Entered Array : "+Arrays.toString(arr));
        System.out.print("Enter you Key : ");
        int key = sc.nextInt();
        System.out.println("Your Key Element at Index : " + Ascorder(arr, key));
    }
}
