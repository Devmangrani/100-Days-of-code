import java.util.*;
 public class Day93 {
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
            
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter lenght of the array : ");
            int lenght = sc.nextInt();
            int number[] = new int[lenght];
            System.out.println("Enter Elements of the Array : ");
            //reverse(number);
            for (int i = 0; i < number.length; i++) {
                number[i] = sc.nextInt();
            }
            System.out.println("Your Entered Array : "+Arrays.toString(number));
            reverse(number);
            System.out.println("Your Reversed Array : "+Arrays.toString(number));
            
          }
    }
    

