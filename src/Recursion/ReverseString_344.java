package Recursion;

public class ReverseString_344 {
    public static void reverseChar(char[] ques,int idx){
        if (idx==ques.length/2){
            return;
        }
        reverseChar(ques,idx+1);
        swap(ques,idx,ques.length-idx-1);
    }

    private static void swap(char[] ques, int li, int l2) {
        char temp=ques[li];
        ques[li]=ques[l2];
        ques[l2]=temp;
    }

    public static void main(String[] args) {
       char[] ch={'a','b','c','f','g'};
        reverseChar(ch,0);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);;
        }
    }
}
