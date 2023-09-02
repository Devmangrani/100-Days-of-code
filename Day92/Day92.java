import java.util.Scanner;

class Day92 {
    public static int reverse() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0 ;
        while (x!=0) {
            int n = x%10;
            if((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE/10)){
                return 0 ;
            }
             ans = (ans*10) + n;
             x = x/10;
             
             
        }
        System.out.println(ans);
        return ans;
        
    }
    public static void main(String[] args) {
        //System.out.println("hey");
        reverse();
    }
        }
    
