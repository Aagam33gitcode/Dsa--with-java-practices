package Practics;

public class Delete_Array {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        print(arr);
        delete(arr,2);
        print(arr);
    }
    public static void delete(int[] arr ,int pos){

        System.out.println(+arr[pos]+" Deleted");
        for (int i = pos; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=0;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
