package Recursion_java;

public class dice_count {

    public static void main(String[] args) {
//        count_role(4,0,"");
diceprint(3,"");
    }
    public static void count_role(int n , int curr, String ans){
        if(curr == n){
            System.out.println(ans+ " ");
        }
        if (curr>n){
            return;
        }
//        count_role(n,curr+1,ans+1);
//        count_role(n,curr+2,ans+2);
//        count_role(n,curr+3,ans+3);
    //for many n
        for(int i=1;i<=3;i++) {
            count_role(n, curr + i, ans + i);

        }
    }
    // wihtout current value
    public static void diceprint(int n,String ans){

        if (n==0){
            System.out.print(ans+" ");
            return;
        }
        if (n<0){
            return;
        }

//       diceprint(n-1,ans+"1");
//       diceprint(n-2,ans+"2");
//       diceprint(n-3,ans+"3");
//       diceprint(n-4,ans+"4");
//       diceprint(n-5,ans+"5");
//       diceprint(n-6,ans+"6");
        for (int i = 1; i <= n; i++) {
            diceprint(n-i,ans+i);
        }
    }

}
