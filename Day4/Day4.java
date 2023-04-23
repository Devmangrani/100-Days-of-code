import java.util.Scanner;

//package 100 Days of code.Day4;

public class Day4 {
    //This code is for multipling 2 no. from taking Input and makin function of it
    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a * b = " + multiply(a, b));
    }
}
