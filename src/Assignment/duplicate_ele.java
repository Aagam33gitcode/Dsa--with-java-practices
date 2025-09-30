package Assignment;

public class duplicate_ele {
    public static void main(String[] args) {
        int[] arr={1,12,11,2,1};


        for (int i = 0; i < arr.length; i++) {
            for (int j= arr.length-1;j>=1;j-- ){
                if(arr[i]==arr[j]){
                    System.out.println("true");
                    return;
                }
                else {
                    System.out.println("false");
                    return;
                }
            }
        }

    }
}
