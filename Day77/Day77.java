import java.util.Scanner;

public class Day77 {
    /*
     * Sample Input
     * 
     * 2
     * Sample Output
     * 
     * 2 x 1 = 2
     * 2 x 2 = 4
     * 2 x 3 = 6
     * 2 x 4 = 8
     * 2 x 5 = 10
     * 2 x 6 = 12
     * 2 x 7 = 14
     * 2 x 8 = 16
     * 2 x 9 = 18
     * 2 x 10 = 20
     */
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }*/
    /*Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    double d = sc.nextDouble();
    sc.nextLine();//Single word Entry Without any delimeters
    String s = sc.nextLine();
  //  s = sc.nextLine();
    System.out.println("String :" + s);
    System.out.println("Double :" + d);
    System.out.println("Int :" + i);
    sc.close();
}
}


