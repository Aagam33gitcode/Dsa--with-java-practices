package Array;

import java.util.Arrays;

public class mediumTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 8,10};
        int[] arr2 = {3, 4, 5, 6, 7,9};
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];
        System.out.println(medium(arr1,arr2,arr3));

    }
          public static void add(int[] arr1,int[] arr2,int[] arr3){
            for (int j = 0; j < arr1.length; j++) {
                arr3[j]=arr1[j];
            }
            for (int k = 0; k < arr2.length; k++) {
                arr3[arr1.length + k] = arr2[k];
            }


        }
        public static double medium(int[] arr1,int[] arr2,int[] arr3){
            add(arr1,arr2,arr3);
            Arrays.sort(arr3);
            for(int arr:arr3){
                System.out.print(arr+" ");
            }
            System.out.println();
            int i=0;
            int j=arr3.length-1;
double med;
            while (i<=j) {
                int count1 = i;
                int count2 = j;
                if (arr3.length%2==0){
                    if (count1+1==count2) {
                         med = (arr3[i] + arr3[j]) / 2.0;

                        return med ;
                    }            }else
                if (count1==count2){
                     med = (arr3[i] + arr3[j]) / 2.0;
//                    System.out.println(med);
                    return med;
                }
                i++;
                j--;

            }
return -1;
        }
    }
