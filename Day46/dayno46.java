//package 100 Days of code.Day46;

public class dayno46 {
    //Kadane's Algorithms
    public static void Kadanes(int nubers[]) {
        int ms = Integer.MIN_VALUE; //Maximum Sum
        int cs =  0; //Current Sum
        for (int i = 0; i < nubers.length; i++) {
            cs = cs + nubers[i];
            if (cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Your Max SubArray Sum is : "  + ms);
    }
    public static void main(String[] args) {
        int nubers[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(nubers);
    }
}
