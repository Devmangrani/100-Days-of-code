import java.util.Scanner;

public class Day1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;
         do {
            System.out.println("Enter no. : ");
            number = sc.nextInt();
            if(number % 2 == 0) {
                evensum += number;
            }else {
                oddsum += number;
            }
            System.out.println("do you want to continue? press 1 for yes or 0 for no");
            choice = sc.nextInt();

         }while(choice==1);
         System.out.println("Even numbers : " + evensum);
         System.out.println("odd numbers : " + oddsum);
    }
}
    