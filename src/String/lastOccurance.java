package String;

public class lastOccurance {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,4,5,6};
        System.out.println(lastOcc(arr,22));
    }
    public static int lastOcc(int[] arr,int val){
        int last=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val){
                last=i;


            }

        }
        return last;
    }
}
