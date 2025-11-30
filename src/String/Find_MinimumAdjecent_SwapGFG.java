package String;

public class Find_MinimumAdjecent_SwapGFG {
    public static void main(String[] args) {
        System.out.println(minSwap("][][][][]]]][][][][]]"));

    }
    public static int minSwap(String s) {
        int open = 0;
        int close = 0;
        int unbalance = 0;
        int swap = 0;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                open++;
                if(unbalance>0){
                    swap+=unbalance;
                    unbalance--;
                }
            }else{
                close++;
                unbalance=close-open;
            }
        }return swap;
    }
}
