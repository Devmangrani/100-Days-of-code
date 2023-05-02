import java.util.Scanner;

//package 100 Days of code.Day12;

public class Day12 {
    public static int binarysearch(int number[], int key) {
        int start = 0, end = number.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid]<key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your key : ");
        int key =  sc.nextInt();
        int number[] = {1,2,3,4,5,6,7,8,9};
        int index = binarysearch(number, key);
        if (index == -1) {
            System.out.println("Invalid NO.");
        }else{
            System.out.println("Your Key : " + index);
        }
    }
}
