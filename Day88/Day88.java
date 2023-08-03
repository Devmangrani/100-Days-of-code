import java.util.Arrays;
public class Day88 {
    public static void InsertionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,3,9,2,1,8};
        InsertionSort(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
