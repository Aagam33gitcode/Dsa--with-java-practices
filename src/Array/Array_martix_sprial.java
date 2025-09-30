package Array;

import java.util.ArrayList;
import java.util.List;

public class Array_martix_sprial {

    public static void main(String[] args) {
     int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
//        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ll =new ArrayList<>();
        System.out.print( Sprial_matrix(matrix,ll));


    }
    public static List<Integer> Sprial_matrix(int[][] arr, List<Integer> ll) {
//        int n = arr[0].length;
//        int m = arr.length;
//        int sr = 0;
//        int ec = n - 1;
//        int er = m - 1;
//        int sc = 0;
//
//        int count = m * n;
//        while (count > 0) {
//            for (int i = sc; i <= ec; i++) {
//                ll.add(arr[sr][i]);
//            }
//            sr++;
//
//            if(count==0){
//                break;
//            }
//            for (int i = sr; i <= er; i++) {
//                ll.add(arr[i][ec]);
//                count--;
//
//            }
//            ec--;
//            if(count==0){
//                break;
//            }
//
//            for (int i = ec; i >= sc; i--) {
//                ll.add(arr[er][i]);
//                count--;
//            }
//            er--;
//
//            if(count==0){
//                break;
//            }
//            for (int i = er; i >= sr; i--) {
//                ll.add(arr[i][sc]);
//                count--;
//            }
//            sc++;
//
//            if(count==0){
//                break;
//            }
//
//
//        }


        int minR = 0;
        int maxR = arr.length-1;
        int minC = 0;
        int maxC = arr[0].length-1;
        int count = 0;
        int total_ele= (arr.length*arr[0].length);
while(count<total_ele-1) {
    for (int i = minC; i <= maxC && count<total_ele; i++) {
//        System.out.print(arr[minR][i] + " ");
        ll.add(arr[minR][i]);
        count++;

    }
//    System.out.println();
    minR++;
    for (int i = minR; i <= maxR && count<total_ele; i++) {
//        System.out.print(arr[i][maxC] + " ");
        ll.add(arr[i][maxC]);
        count++;

    }
    maxC--;
//    System.out.println();

    for (int i = maxC; i >= minC && count<total_ele; i--) {
//        System.out.print(arr[maxR][i] + " ");
        ll.add(arr[maxR][i]);
        count++;


    }
    maxR--;
//    System.out.println();
    for (int i = maxR; i >= minR && count<total_ele; i--) {
//        System.out.print(arr[i][minC] + " ");
        ll.add(arr[i][minC]);
        count++;
    }
    minC++;
//    System.out.println();

}
        System.out.println(count);
return ll;
     }}