import java.util.Scanner;

public class Day82 {
    //Binary Search
    public static int  BinarySearch(int Arr[], int key) {
        int start = 0;
        int end = Arr.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(Arr[mid]==key){
                return mid;
            }
            if (Arr[mid]<key) {
                start=mid + 1; 
            }else{
                end = mid-1;
            }
        }
        return -1;
       
    }
    public static void main(String[] args) {
        int Arr[] = {1,2,3,4,5,6,7,8,9};
        //int key =4;
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("Element found on Index : " + BinarySearch(Arr, key));
        
    }
}
