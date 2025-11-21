package Array;

public class Sqrt_x_69 {
    public static void main(String[] args) {
        int x=11;
        System.out.println("Leetcode 69: "+sqR(x));
        int y=25; 
        int ans=countSquareGOG(y)-1;
        System.out.println("GOG COunt Square: "+ans);
    }
    public static int sqR(int x){
         if(x==0){
            return 0;
        }
        int start=1;
        int end=x;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid == x / mid && x % mid == 0){
return mid;
            }else if (x/mid<mid){
                end=mid-1;
            }
            else {
                start=mid+1;
                ans=mid;

            }
        }
        return ans;
    }
    public static int countSquareGOG(int x){

            if(x==0){
                return 0;
            }
            int start=1;
            int end=x;
            int ans=-1;
            while (start<=end){
                int mid=start+(end-start)/2;
                if (mid == x / mid && x % mid == 0){
                    return mid;
                }else if (x/mid<mid){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                    ans=mid;

                }
            }
            return end+1;
        }}
