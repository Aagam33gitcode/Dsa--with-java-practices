package Array;

public class transpose_48 {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println( pali(n));
    }

public static boolean pali(int n) {
    String x = Integer.toString(n);
    boolean flag = false;
    int b=x.length();
    for (int i = 0; i < x.length()/ 2; i++) {
        if (x.charAt(i) != x.charAt(b -1-i)) {
            return flag;
        }

    }

return true;
}



























































































//        int[][] martix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        transpose(martix);
//        for (int i = 0; i <martix.length; i++) {
//
//            for (int j =0; j<martix[0].length; j++) {
//
//                System.out.print(martix[i][j]);
//            }
//            System.out.println();
//
//
//        }
//
//    }
//
//    public static int[][] transpose(int[][] arr) {
//        int n = arr.length;
//        System.out.println(n);
//        int m = arr[0].length;
//        System.out.println(m);
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//
//            for (int j =0; j<m; j++) {
//
//arr[j][n-1-i]=arr[i][j];
//
////                System.out.print(arr[i][j]);
//            }
////            System.out.println();
//
//
//    }
//return arr;
//

        }
