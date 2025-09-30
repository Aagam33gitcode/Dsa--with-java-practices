package String;

public class strictlyGreater {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(greater(arr,0));
    }
    public static int greater(int[] arr,int val){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>val){
                System.out.println("Index: "+i+" "+"val "+arr[i]);
                count++;
            }

        }
        return count;
    }
}
