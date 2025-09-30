package String;

public class largest_Odd_String_1903 {
    public static void main(String[] args) {
        String s="234542";
        System.out.println(largestString(s));

    }
    public static String largestString(String s){
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)%2!=0){
                return s.substring(0,i+1);
            }


        }return "";
    }
}
