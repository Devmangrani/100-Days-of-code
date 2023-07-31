//package Kadanes Algo;

public class Day85 {
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3,4,2,1,8,4,5,7,-4,-2,-2,-71};
        int ms =Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sub Array Sum is : " +ms);
    }
}
