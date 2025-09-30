package Recursion_java;

import java.util.ArrayList;
import java.util.List;

public class lexographicOrder {
    public static void main(String[] args) {
        printOrder(0,13);
List<Integer> ll=new ArrayList<>();
printOrder1(0,13,ll);
ll.remove(0);
        System.out.println(ll);
    }
    public static void printOrder(int curr,int n){
      if(curr>n){
          return;
      }
//        Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
//
        System.out.print(curr+" ");


        int i=0;
        if(curr==0){
            i=1;}
        for (; i <= 9; i++) {
            printOrder(curr*10+i,n);
        }
    }
    public static void printOrder1(int curr, int n, List<Integer> ll){
        if(curr>n){
            return;
        }
        ll.add(curr);
        int i=0;
        if(curr==0){
            i=1;}
        for (; i <= 9; i++) {
            printOrder1(curr*10+i,n,ll);
        }
    }
}
