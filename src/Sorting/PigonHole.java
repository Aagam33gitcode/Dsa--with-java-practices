package Sorting;

public class PigonHole {
    public static void main(String[] args) {
        int[] arr={24,22,25,21,27};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        pigonhole(arr);
    }
    public static void pigonhole(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

            if (arr[i]<min){
                min=arr[i];
            }

        }
//        System.out.println(max);//27
//        System.out.println(min);//21
        int size=max-min+1;
        int[] pighole=new int[size];
        //count
        for (int i = 0; i < arr.length; i++) {
            int idx=arr[i]-min;
            pighole[idx]++;
        }

        int insertIdex=0;
        for (int j = 0; j < pighole.length; j++) {
            while (pighole[j]!=0){
            arr[insertIdex]=j+min;
                pighole[j]--;
                insertIdex++;
        }}
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i!= arr.length-1){
                System.out.print(", ");
            }
        }
    }
}
