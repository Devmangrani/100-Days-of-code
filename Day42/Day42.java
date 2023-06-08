public class Day42 {
    
        //Overloading methods to calculate Areas
        public static double area(double radius) {
            return Math.PI*radius*radius;
        }
        //Overloading Method to reverse a int or a Array
        public static int reverse(int n) {
            int rev = 0;
            while(n!=0)
            {
                rev=rev*10+n%10;
                n=n/10;
            }
            return rev;
        }
        
        //Overload method to validate name and Age
        public static boolean validate(String name){
            return name.matches("Dev");
        }
        public static boolean validate(int age){
            return age>=3 && age<=15;
        }
        public static void main(String[] args) {
            System.out.println(area(5));
            System.out.println(reverse(12345));
            System.out.println(validate("Dev"));
    
        }
    }
    

