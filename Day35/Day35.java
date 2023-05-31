//package 100 Days of code.Day35;

public class Day35 {
    // Mathods
    static int max(int x, int y) {
        x++;
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String args[]) {
        int a = 10, b = 15, c;
        c = max(a, b);
        System.out.println(c);
    }
}
