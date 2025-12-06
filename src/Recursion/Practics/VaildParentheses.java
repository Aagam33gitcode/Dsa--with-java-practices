package Recursion.Practics;

public class VaildParentheses {
    public static void main(String[] args) {
        validp(4,0,0,"");

    }
    public static void validp(int n, int open, int close, String ans){
        if(open==n&&close==n){
            System.out.println(ans+" ");
            return;
        }
        if (open>close){
            validp(n,open,close+1,ans+")");
        }
if (open<n){
        validp(n,open+1,close,ans+"(");

    }}
}
