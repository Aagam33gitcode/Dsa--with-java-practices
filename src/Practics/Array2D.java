package Practics;
import static Practics.Delete_Array.delete;
import static Practics.Delete_Array.print;
import static Practics.InsertArray.insert1;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{2,3},{43,2,11,2},{32,3,2,1,2,1}};
        int [] arr1={1,2,3,4,5,6};
        print(arr);
        System.out.println("new array");
    insert(arr,3,2,10);
    print(arr);
        System.out.println("new Array");
delete1(arr, 3,2);
print(arr); 
    }
    public static void  print(int[][] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j!= arr[i].length){
                    System.out.print(", ");
                }

            }
            System.out.println();
        }

    }

    public static void insert(int[][] arr ,int pos1,int pos2,int ele){
            insert1(arr[pos1],pos2,ele);
    }
    public static void delete1(int[][] arr ,int pos1, int pos2){
        delete(arr[pos1],pos2);
    }
}
