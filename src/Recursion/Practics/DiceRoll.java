package Recursion.Practics;

public class DiceRoll {
    public static void main(String[] args) {
        int n=4;
        System.out.println("Dics count: "+diceCount(n,""));
        dice(n,"");

    }
    public static void dice(int n,String ans) {

        if (n==0){
            System.out.println(ans+" ");
            return ;
        }
   /*     if (n<0){
            return;
        }
        dice(n-1,ans+"1");
        dice(n-2,ans+"2");
        dice(n-3,ans+"3");
*/
        for (int i = 1; i<=6 &&i <=n ; i++) {
            if (ans.length()==0 && i==n){
                continue;
            }
            dice(n-i,ans+i);
        }
    }
    public static int diceCount(int n,String ans) {
        int a=0;
        if (n==0){
//            System.out.println(ans+" ");
            return 1 ;
        }
        for (int i = 1; i<=6 &&i <=n ; i++) {
            if (ans.length()==0 && i==n){
                continue;
            }
           a+= diceCount(n-i,ans+i);
        }

        return a;
    }
}
