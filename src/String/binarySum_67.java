package String;

public class binarySum_67 {
    public static void main(String[] args) {

    }
    public  static void  add(String s1,String s2){
        int a= s1.length();
        int b=s2.length();

        String ans="";
        int carry=0;
        while (a>=0||b>=0||carry==1){
            if(a>=0){
                carry=carry+s1.charAt(a)-'0';
                a--;

            }

            if(b>0){
                carry=carry+s2.charAt(b)-'0';
                b--;
            }
            ans=ans+carry%2;
            carry=carry/2;
        }


    }
}
