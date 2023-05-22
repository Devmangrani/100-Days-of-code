//package 100 Days of code.Day29;

public class Day29 {
    public static void main(String[] args) {
        //Multiplication of arrays
        int A[][]={{3,5,9},{7,6,2},{4,3,2}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int C[][]=new int [3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j]=0;
                for (int k = 0; k < C.length; k++) {
                    C[i][j]=C[i][j]+A[i][j]*B[k][j];
                }
            }
        }
        for (int x[] : C) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
}
}
