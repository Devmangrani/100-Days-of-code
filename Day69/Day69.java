public class Day69 {
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
                System.out.println();
            }
            System.out.println("Maxsub : " + MaxSub);
        }
    }
}
