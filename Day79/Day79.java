//package 100 Days of code.Day79;
import java.util.Scanner;

import javax.naming.InitialContext;

import java.util.*;

public class Day79 {
    /*
     * public static void main(String[] args) {
     * int[] nums = { 3, 4, 5, 6 };
     * for (int i = 0; i < nums.length; i++) {
     * System.out.println(nums[i]);
     * }
     * change(nums);
     * for (int i = 0; i < nums.length; i++) {
     * System.out.print(nums[i] + " ,");
     * }
     * }
     * 
     * static void change(int arr[]) {
     * arr[0] = 99;
     * }
     * //2D Arrays
     * int[][] arr =new int[3][3];
     */

    /*public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 } };
                for (int row = 0; row < arr.length; row++) {
                    for (int col = 0; col < arr[row]. length; col++) {
                        System.out.print(arr[row][col] + " ");
                    }
                    System.out.println();
                }
    }*/
    //Arrar list
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Syntax
        //ArrayList<Integer> list = new ArrayList<>();
        /*list.add(68);
        list.add(56);
        list.add(8);
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);*/
        //input
       /*  for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }*/
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}