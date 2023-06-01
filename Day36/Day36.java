import java.lang.reflect.Method;

//package 100 Days of code.Day36;

public class Day36 {
    //Methods Practise
    static int min(int x, int y){
        if(x<y)
            return x;
        else
            return y;
        
    }
    public static void main(String[] args) {
        int a=10,b=19,c;
        
        System.out.println(min(a,b));
    }
}
