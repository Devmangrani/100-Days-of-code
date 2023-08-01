public class Day86 {
    //Bubble Sort
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) { //i=>turn
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,2,8,2,9,3};
        BubbleSort(arr);
        printArr(arr);
    }
}
