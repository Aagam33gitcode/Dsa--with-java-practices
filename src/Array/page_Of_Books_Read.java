package Array;

public class page_Of_Books_Read {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(pageBooks(arr,2));

    }
    public static int pageBooks(int[] page,int m){
    int low=0;
    int high=0;
        for (int i = 0; i < page.length; i++) {
            high=high+page[i];
        }
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(isItPossible(page,m,mid)==true){
                ans=mid;
                high=mid-1;
            }else{ low=mid+1;}
        }return ans;
}
private static boolean isItPossible(int[] page,int m,int mid){
        int student=1;
        int read=0;
    for (int i = 0; i < page.length; i++) {
        if(read+page[i]<=mid){
            read+=page[i];
        }
        else {
            student++;
            read=page[i];
        }
        if (m<student){
            return false;
        }
    }return true;
}

}
