//package 100 Days of code.Day6;

public class Day6 {
    public static int factorial(int n) {
        int f =1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int binomialCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nrm = factorial(n-r);
        int binomialCoeff = fact_n/(fact_r* fact_nrm);
        return binomialCoeff;
    }
    public static void main(String args[]) {
        System.out.println(binomialCoeff(5, 2));
    }
}
