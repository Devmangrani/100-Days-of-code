import java.util.*;
public class Day70 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        int count =0;
        for(int i = 0 ; i <= n ; i++){
            for( int j=0;j<=n;j++){
                count++;
                System.out.format("%2d ",count );
            }
            System.out.println(" ");
        }
    }
    public static void reverse(int number[]) {
        int first = 0, last = number.length-1;
        while(first < last) {
            //swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
           
        }
    }
     //public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9};
        reverse(number);
        for(int i = 0; i<number.length; i++){
            System.out.println(number[i]);
        }
        System.out.println();
     }
}
