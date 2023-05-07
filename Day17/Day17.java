//package 100 Days of code.Day17;

public class Day17 {
    //so toaday I revise Palindrome no. and Do leet code Problems
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
    
}
