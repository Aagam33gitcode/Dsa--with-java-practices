package Heap;

import java.util.PriorityQueue;

public class Kth_Largest_Ele_Array_215{
   public static void main(String[] args) {
       int[] arr={2,3,41,3,5,65,43,2};
       System.out.println(kthLarger(arr,3));
    }
    public static int kthLarger(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
       for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i <arr.length; i++) {
            if (arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
