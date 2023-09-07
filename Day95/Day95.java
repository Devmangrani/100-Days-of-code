import java.lang.reflect.Array;
import java.util.*;

public class Day95 {
    //1295. Find Numbers with Even Number of Digits
    public static int Digits(int num) {
        if(num<0){
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }
    public static boolean Even(int num) {
        int numofDigit = Digits(num);
        if(numofDigit % 2 == 0){
            return true;
        }
        return false;
    }
    public static int findNum(int nums[]) {
        int  count = 0;
        for (int num : nums) {
            if (Even(num)) {
                count++;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNum(nums));
    }
}
