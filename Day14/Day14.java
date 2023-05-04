//package 100 Days of code.Day14;

public class Day14 {
    public static void reverse(int number[]) {
        int first = 0, last = number.length-1;
        while(first < last) {
            //swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
           
        }
    }
     public static void main(String[] args) {
        int number[] = {4,8,10,12,14,16,18,20};
        reverse(number);
        for(int i = 0; i<number.length; i++){
            System.out.println(number[i]);
        }
        System.out.println();
     }
}
