import java.util.Scanner;

public class Day2 {
    public static void main(String args[]) {
        //Cheak if a number is prime or not?
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2) {
            System.out.println("n is prime");
        }else {
            boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){ //n is a multiple of i 
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("n is Prime no. ");
        }else{
            System.out.println("n is not a Prime no.");
        }
        }
        
           
    }

}