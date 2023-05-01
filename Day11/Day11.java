import java.util.*;
//package 100 Days of code.Day11;

public class Day11 {
        public static int Linearsearch(int number[], int key) {
            for(int i=0; i<number.length; i++){
                if(number[i]==key) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter key : ");
            int key = sc.nextInt();
            int numbers[] ={1,2,3,4,5,6,7,8,9};
            //int key = 5;
            int index = Linearsearch(numbers, key);
            if(index==-1){
                System.out.println("Not Found");
            }else{
                System.out.println("key : " + index);
            }
        }
    }
    

