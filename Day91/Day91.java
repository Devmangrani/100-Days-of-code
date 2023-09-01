import java.util.Scanner;

public class Day91 {
   // Question-> Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
   public static int value() {
    Scanner sc = new Scanner(System.in);
    int value1 = sc.nextInt();
    int value2 = sc.nextInt();
    int value3 = sc.nextInt();
    if (value1>=value2 && value1>=value3) {
        System.out.println(value1);
    } else if (value2>=value1&&value2>=value3) {
        System.out.println(value2);
    }else{
        System.out.println(value3);
    }
    

    return 0;
   }
   //Question->Define a program to find out whether a given number is even or odd.
    public static void evenYAodd() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value % 2==0) {
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
    //Question->Define a method to find out if a number is prime or not.
    public static void isprime() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        //if(value<=1){
            //System.out.println(false);
        //}
        //for (int i = 2; i < value; i++) {
            int i = 2;
            if (value%i==0) {
                System.out.println("not a prime");
            }else{
                System.out.println("a prime");  
            }
        //}
        


          }
    public static void main(String[] args) {
        System.out.println("hey");
        //value();
        //evenYAodd();
        //isprime();
        //Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        int i,fact=1;  
        int number=10;    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  
        
    }

