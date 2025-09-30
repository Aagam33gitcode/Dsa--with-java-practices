package Digit;

public class printSExceptX {
    public static void main(String[] args) {
        peintString("weqawer", 'a', 0,"");
    }

    public static void peintString(String s, char x,int idx,String ans) {


        if(idx>=s.length()){
            return;
        }
        if(s.charAt(idx)!=x){
            System.out.print(ans+s.charAt(idx));

        }

peintString(s,'a',idx+1,ans);


    }

}