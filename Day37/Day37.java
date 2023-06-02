public class Day37 {
    //Methods
    /*public static void update(int A[]) {
        A[0]=25;
    }
    public static void main(String[] args) {
        int A[]={2,3,4,5,6};
        update(A);
        System.out.println(A[]);
    }*/
    public static void Change(int A[],int index, int value) {
        A[index]=value;
    }
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        Change(A, 2, 20);
        for (int x : A) {
            System.out.print(x + ", ");
        }
    }
}
