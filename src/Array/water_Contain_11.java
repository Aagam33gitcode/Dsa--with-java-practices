package Array;

public class water_Contain_11 {

    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,3,7};
        System.out.println(waterContains(arr));
    }


    public static int waterContains(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int maxWt=0;
        while (i<j){
            int width=j-i;
            int height=Math.min(arr[i],arr[j]);
            int currWater=width*height;
            maxWt= Math.max(maxWt,currWater);
            if(arr[i]<arr[j]){
                i++;
            }
            else {
                j--;
            }
        }return maxWt;
    }
}
