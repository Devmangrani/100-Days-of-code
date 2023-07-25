import java.util.*;
public class Day80 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(68);
        list.add(56);
        list.add(8);
        list.add(90);
        list.add(63);
        
        list.set(0, 99);
       // list.remove(2);
        System.out.println(list);
       // input
         for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
}}
