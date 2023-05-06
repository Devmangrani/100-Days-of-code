//package 100 Days of code.Day16;

public class Day16 {
    public static int largestno(int number[]) {
        int largestno = Integer.MIN_VALUE;
        for(int i=0;i<number.length; i++) {
            if(largestno< number[i]) {
                largestno = number[i];
            }
        }
        return largestno;
    }
   public static void main(String[] args) {
        int number[] = {1,7,9,4,6};
        System.out.println("Largest no : " + largestno(number));
    }
}
