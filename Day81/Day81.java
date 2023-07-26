import java.security.Key;
import java.util.Scanner;

public class Day81 {
    public static int linearsearch(int Arr[] , int Key) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i]==Key) {
                return i ; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Arr[] =  {18,12,9,14,77,50};
        Scanner sc = new Scanner(System.in);
        int key  = sc.nextInt();
        System.out.println("Enter key from Array : " + key);
        for(int i=0; i<Arr.length ; i++){
            System.out.print(Arr[i] + ", ");
        }

        int index = linearsearch(Arr, key);
        if (index == -1 ) {
            System.out.println("Not Found");
        }else {
            System.out.println("Found on : " + index);
        }
        
        
    }
}
