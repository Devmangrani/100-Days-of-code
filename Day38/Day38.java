public class Day38 {
    public static void main(String[] args) {
        //Multiplication of arrays
        int A[][]={{3,5,9},{7,6,2},{4,3,2}};
        int B[][]={{18,5,6},{2,15,5},{5,3,12}};
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
