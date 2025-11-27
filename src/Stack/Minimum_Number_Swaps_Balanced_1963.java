package Stack;

public class Minimum_Number_Swaps_Balanced_1963 {
    public static void main(String[] args) {
        System.out.println(countParenValid("]]][[["));
    }
    public static int countParenValid(String s){
        if (s.length()%2!=0)
            return -1;

        int open=0;
        int close=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='['){
                open++;
            }else {
                if (open>0){
                    open--;
                }else {
                    close++;

                }
            }
        }



        return (close+1)/2;
    }
}
