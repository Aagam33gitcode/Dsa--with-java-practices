package Recursion;

public class phoneClick_17 {
    public static void main(String[] args) {
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printPhone("23","",arr);
    }
    public static void printPhone(String que,String ans,String[] arr){
        if(que.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=que.charAt(0);
        String pass=arr[ch-48];//AsCII
        for (int i = 0; i < pass.length(); i++) {
            char ch1=pass.charAt(i);
            printPhone(que.substring(1),ans+ch1,arr);
        }


    }
}
