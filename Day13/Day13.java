import java.util.*;
//package 100 Days of code.Day13;

public class Day13  {
    public static boolean ispalindrome(int n) {
        int palindrome = n;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int palindrome = sc.nextInt();
        if (ispalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else {
            System.out.println("Number : " + palindrome + " is not a palindrome no.");
        }
    }
}


