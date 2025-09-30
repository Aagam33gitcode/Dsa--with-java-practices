package Array;

import java.util.Arrays;

public class Boats_to_Save_People_881 {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 2, 1};
        int[] arr = {5, 1, 4, 2};
        System.out.println(boatSave(arr, 6));

    }

    public static int boatSave(int[] arr, int limit) {
        //first have to sort the array
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            count++;
            if (arr[i] + arr[j] <= limit) {
                i++;
            }
            j--;
        }
        return count;
    }
}

