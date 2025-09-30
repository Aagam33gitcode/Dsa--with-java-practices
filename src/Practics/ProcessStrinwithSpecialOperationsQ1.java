package Practics;

public class ProcessStrinwithSpecialOperationsQ1 {
    public static void main(String[] args) {
        System.out.println(printString("w%",0));
//        System.out.println(printString1("z*#"));
    }
    public static char printString(String s,long k) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ans += ch;
            } else if (ch == '*') {
                if (ans.length() > 0) {
                    ans = ans.substring(0, ans.length() - 1);
                }
            } else if (ch == '#') {
                ans = ans + ans;
            } else if (ch == '%') {
                ans = reverse(ans);
            }
        }
        if(ans.length()<1||k>ans.length()){
            return '.';
        }
        return ans.charAt((int)k-1);
    }
    private static String reverse(String s){
        String ans="";
        for (int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }return ans;
    }

}
