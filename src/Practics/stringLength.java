package Practics;

public class stringLength {
    public static void main(String[] args) {
        String ww="83145";
        ss(ww);
    }
    public static void ss(String s){
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j <s.length() ; j++) {
//                System.out.print(s.substring(j,j+1)+" ");
//            }
//            System.out.println();
//        }


        for (int len = 1; len <=s.length() ; len++) {
            for (int j=len;j<=s.length();j++){
                int i=j-len;
                System.out.print(s.substring(i,j)+ " ");
            }
            System.out.println();
        }
    }

}
