package Array;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_II_59 {
    public static void main(String[] args) {
int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//List<Integer> ans=new ArrayList<>();
//sprial(arr,ans);
//        System.out.println(ans);
        int n=3;
        int[][] ans1=new int[n][n];
        sprialArray(3,ans1);
        for (int i = 0; i < ans1.length; i++) {
            for (int j = 0; j < ans1[i].length; j++) {
                System.out.print(ans1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static List<Integer> sprial(int[][] arr , List<Integer> ans){
        int minR=0;
        int minC=0;
        int maxR= arr.length-1;
        int maxC= arr[0].length-1;
        while (minR<=maxR&&minC<=maxC){
            for (int i = minC; i <=maxC ; i++) {
                ans.add(arr[minR][i]);
            }
            minR++;
            for (int i = minR; i <=maxR ; i++) {
                ans.add(arr[i][maxC]);
            }
            maxC--;
            for (int i = maxC; i >=minC ; i--) {
                ans.add(arr[maxR][i]);
            }
            maxR--;
            for (int i = maxR; i >=minR ; i--) {
                ans.add(arr[i][minC]);
            }
              minC++;

        }
        return ans;
    }
    public static int[][] sprialArray( int n ,int[][] ans){
        int minR=0;
        int minC=0;
        int maxR= n-1;
        int maxC= n-1;
        int val=1;

        while (minR<=maxR&&minC<=maxC&&val<=n*n){
            for (int i = minC; i <=maxC ; i++) {
//                ans.add(arr[minR][i]);
                ans[minR][i]=val;
                val++;
            }
            minR++;
            for (int i = minR; i <=maxR ; i++) {
//                ans.add(arr[i][maxC]);
                ans[i][maxR]=val;
                val++;

            }
            maxC--;
            for (int i = maxC; i >=minC ; i--) {
//                ans.add(arr[maxR][i]);
                ans[maxR][i]=val;
                val++;

            }
            maxR--;
            for (int i = maxR; i >=minR ; i--) {
//                ans.add(arr[i][minC]);
                ans[i][minC]=val;
                val++;

            }
              minC++;

        }
        return ans;
    }
}
