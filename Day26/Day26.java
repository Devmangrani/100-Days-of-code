//package 100 Days of code.Day26;

public class Day26 {
    public static void main(String[] args) {
        //Finding Second largest Element
        int A[]={3,9,8,7,6,5,4,10,15,12};
        int max1 = A[0];
        int max2 = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max2=A[i];
                
            }else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("Second largest no. : " + max2);
}}
