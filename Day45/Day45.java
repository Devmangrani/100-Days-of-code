//package 100 Days of code.Day45;

public class Day45 {
    public static void MaxSubArrays(int numbers[]) {
        int currsum = 0;
        int MaxSub = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = 0; j < numbers.length; j++) {
                int end=j;
                currsum = 0;
                for (int k = start; k < end; k++) {
                    currsum += numbers[k];
                }
                System.out.print(currsum + "  ");
                if(MaxSub < currsum) {
                    MaxSub = currsum;
                }
                //System.out.println();
            }
            System.out.println("Maxsub : "+MaxSub);
        }
    }
    public static void main(String[] args) {
        int Number[]={2,4,6,8,10,12};
        MaxSubArrays(Number);
    }
}
