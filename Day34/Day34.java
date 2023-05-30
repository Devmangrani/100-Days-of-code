import java.util.*;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.");
        int n = sc.nextInt();
        for(int i =0; i<=n;i++){
            for(int j= 0;j<=n;j++){
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(" ");
        }
    }
}
