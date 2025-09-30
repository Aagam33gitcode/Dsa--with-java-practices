package Array;

public class Kth_root {
    public static void main(String[] args) {
        int n=67;
        int k=2;
        System.out.println(squareKth(n,k));

    }
    public static int squareKth(int n, int k){
        int low=1;
        int  high=n;
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
                    if (Math.pow(mid,k)<=n){
                  ans=mid;
                  low=mid+1;
                    }else
                        high=mid-1;
        }
        return ans;

    }
}
