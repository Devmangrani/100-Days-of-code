import java.security.Key;

public class Day81 {
    public static int linearsearch(int Arr[] , int Key) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i]==Key) {
                return i ; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Arr[] =  {18,12,9,14,77,50};
        for(int i=0; i<Arr.length ; i++){
            System.out.print(Arr[i] + " ,");
        }
        
        //Find Weather 14 exists in Array or not?
        int key = 14;
        int index = linearsearch(Arr, key);
        if (index == -1 ) {
            System.out.println("Not Found");
        }else {
            System.out.println("Found on :" + index);
        }
        
        
    }
}
