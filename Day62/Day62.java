public class Day62 {
    // Advanced Patterns Hollow Rectangle
    public static void Hollow_rectangle(int rows , int columns){
        //Outer loop
        for (int i = 1; i <= rows; i++) {
            //Inner Loop
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_rectangle(4, 5);
    }
}
