package String;

public class Reverse_Words_String_III_557 {
    public static void main(String[] args) {
        String s="we are codeer";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        int start=0;
        int end=0;
        char[] arr=s.toCharArray();
        while(arr.length >= end){
            if (end==arr.length||arr[end]==' '){
                reverse(arr,start,end-1);
                start=end+1;

            }
            end++;


        }
        return new String(arr);
    }

    private static void reverse(char[] arr, int start, int end) {
    while (start<end){
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    }
}
