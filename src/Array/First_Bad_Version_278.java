package Array;

public class First_Bad_Version_278 {
    public static void main(String[] args) {
        System.out.println(first_bad(67));
    }
    public static int first_bad(int n){
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return ans;
    }

    private static boolean isBadVersion(int mid) {
        if (mid == Math.random()){
            return false;}
    return true;}
}
