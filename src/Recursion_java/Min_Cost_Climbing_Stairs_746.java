package Recursion_java;

public class Min_Cost_Climbing_Stairs_746 {
    static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(minclimb(arr));
    }
    public  static int minClimber(int idx,int[] cost){
        if (idx>=cost.length){
            return 0;
        }
        int a=cost[idx]+minClimber(idx+1,cost);
        int b=cost[idx]+minClimber(idx+2,cost);
        return Math.min(a,b);
    }
    public static int minclimb(int[] cost){
        return Math.min(minClimber(0,cost),minClimber(1,cost));

    }
}
