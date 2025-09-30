package Recursion_java;

public class CountNSay_38 {

    public static void main(String[] args) {
        System.out.println(printcountNsay(5));
        System.out.println(printcountNsay2(5));

    }
    public static String printcountNsay(int n){
        if (n==1){
            return "1";
        }
        int i=0;
        int j=0;
        String ans="";
        String s=printcountNsay(n-1);
        while (j<s.length()){
        if(s.charAt(i)==s.charAt(j)){
            j++;
        }
        else {
            int count=j-i;
            ans+=count;
            ans+=s.charAt(i);
            i=j;
        }}
        int count=j-i;
        ans+=count;
        ans+=s.charAt(i);
        i=j;

        return ans;
    }public static String printcountNsay2(int n){
        if (n==1){
            return "1";
        }
        int i=0;
        int j=0;
        String ans="";
        String s=printcountNsay(n-1)+"#";
        while (j<s.length()){
        if(s.charAt(i)==s.charAt(j)){
            j++;
        }
        else {
            int count=j-i;
            ans+=count;
            ans+=s.charAt(i);
            i=j;
        }}

        return ans;
    }
}
