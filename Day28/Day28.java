import java.util.*;
//package 100 Days of code.Day28;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no. : ");
        int n = sc.nextInt();
        for(int i =0 ; i<=n;i++){
            for(int j = 0; j<=n;j++){
                if(n<=j+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
