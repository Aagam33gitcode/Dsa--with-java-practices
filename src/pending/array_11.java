package pending;

public class array_11 {
    public static void main(String[] args) {
        int[] arr={2,5,3,1,2,3,5,2,3,21,2,3};
most_water(arr);
    }
    public static void most_water(int[] arr){
        int i=0;
        int j=arr.length;
        int iMax=arr[0];

        int jMax=arr[j-1];
        while (i<j){
            iMax=Math.max(iMax,arr[i+1]);
             jMax=Math.max(jMax,arr[j-1]);
            i++;
            j--;

        }
        int ans=Math.min(iMax,jMax);
        System.out.println("min ele: "+ans);
        System.out.println(" count");
        System.out.println(iMax);
        System.out.println(jMax);
//        for (int k = ; k < ; k++) {

//        }
    }
}
