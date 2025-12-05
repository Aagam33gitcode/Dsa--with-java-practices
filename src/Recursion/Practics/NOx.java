package Recursion.Practics;

public class NOx {
    public static void main(String[] args) {
        String s="abcxxadxace";
        remove(s,0);
    }
    public static  void  remove (String s,int idx) {
        if(idx>=s.length()){
            return;
        }
        if(s.charAt(idx)!='x'){
            System.out.print(s.charAt(idx));

        }
        remove(s,idx+1);
    }


    }