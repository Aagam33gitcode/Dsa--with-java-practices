package Sorting;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={73,43,5,4,2,45,64,3,22,345};
        int n=arr.length-1;
        for(int turn=1;turn<n;turn++){
                    for(int i=0;i<n-turn;i++){
                        if(arr[i]>arr[i+1]){
                            int temp = arr[i];
                            arr[i] = arr[i+i];
                            arr[i+i] = temp;
                        }
                    }
                }
    }
}
