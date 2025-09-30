package Array;

import java.util.Scanner;

public class Array_Input {
    public static void array_input(int[] arr){
        Scanner sc=new Scanner(System.in);
      int n= arr.length;
        for(int i=1;i<=arr.length;i++){
            System.out.print("Enter the "+i+" element : ");
            arr[i]= sc.nextInt();
        }
//        for(int ww:arr){
//            System.out.println(ww);
//        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        array_input(arr);
//        for(int ww:arr){
//            System.out.println(ww);
//        }



    }
}
