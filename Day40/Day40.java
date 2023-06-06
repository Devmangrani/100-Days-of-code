//package 100 Days of code.Day 40;

public class Day40 {
        // Find a Number is Prime
        /*
         * static boolean isPrime(int n) {
         * 
         * for (int i = 2; i < n / 2; i++) {
         * if (n % i == 0) {
         * return false;
         * }
         * return true;
         * }
         * 
         * }
         */
        public static int HCF(int m, int n) {
            while (m != n) {
                if (m > n)
                    m = m - n;
                else
                    n = n - m;
            }
            return n;
        }
        
        public static void main(String[] args) {
            // Find Greatest Common Divisor(GCD)
            // FInd Highest Common Fcator (HCF)
            System.out.println(HCF(35, 55));
            //Find Maximum Elements in an Array
        }
    }
