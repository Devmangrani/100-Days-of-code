//package 100 Days of code.Day27;

public class Day27 {
    public static void main(String[] args) {
        //Rotation an Arrays
        int A[]={5,9,6,10,12,7,3,5,4,2};
        int temp = A[0];
        for(int i=1;i<A.length;i++){
            System.out.print(A[i] +  ", ");
        }
        A[A.length-1] = temp;
        System.out.println(temp);
}
}