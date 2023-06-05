import java.util.*;
//package Day39;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int evensum = 0;
        int oddsum = 0;
        do {
            System.out.println("Enter no. : ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.println("Do you want to continue? press 1 for yess or 0 or no");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even no. : " + evensum);
        System.out.println("Sum of odd number : " + oddsum);

    }
}
