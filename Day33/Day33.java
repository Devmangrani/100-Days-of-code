import java.util.*;
public class Day33 {
            //Find no. is Armstong is not? n=153 -> 3*3*3 + 5*5*5 + 1*1*1 => 27 + 125 + 1 => 153
        /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. : ");
            int n = sc.nextInt();
            int sum = 0;
            int m = n;
            while(n>0){
                int r = n%10;
                sum = sum + r*r*r;
                n = n/10;
            }
            System.out.println(sum);
            if (m==sum) {
                System.out.println("Its a armstrong no.");
            }else{
                System.out.println("Its not Armstrong no.");
            }
        }*/
        /*public static void main(String[] args) {
            //reverse no. 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no, : ");
            int n = sc.nextInt();
            int rev = 0;
            while (n>0) {
                int r = n%10;
                rev = rev *10 + r;
                n = n/10;
            }
            System.out.println(rev);
        }*/
    public static void main(String[] args) {
        //Find palindrome no.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no. :");
        int n = sc.nextInt();
        int rev =0;
        int pali =n;
        while (n>0) {
            int r = n%10;
            rev = rev * 10 +r;
            n = n/10;
        }
        System.out.println(rev);
        if (pali == rev) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("Its a not a palindrome");
        }
    }
}
