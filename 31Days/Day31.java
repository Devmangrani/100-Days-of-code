//package 100 Days of code.31Days;

public class Day31 {
    public static void main(String[] args) {
        //Adding  2 Matrices
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][]=new int [3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print(C[i][j]=A[i][j]+B[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
