//package 100 Days of code.Day41;

public class day41 {
    //Method Overloading
    public static int max(int x, int y) {
        return x>y?x:y;
    }
    public static float max(float x, float y) {
        if(x>y)
        return x;
        else
        return y;
    }
    public static int max(int x, int y, int z) {
        if(x>y && x>z)
        return x;
        else if (y>z)
        return y;
        else 
        return z;
    }
    public static void main(String[] args) {
        System.out.println(max(10, 4));
        System.out.println(max(15.4f, 10.6f));
        System.out.println(max(10, 5, 18));
    }
}
