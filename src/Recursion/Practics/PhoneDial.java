package Recursion.Practics;

public class PhoneDial {
    public static void main(String[] args) {
        String[] code = {
                "*",
                "#",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
//        phoneclick(code,"234","");
        System.out.println(phoneclick(code,"234",""));

    }
    public static int phoneclick(String[] arr, String ques,String ans){
       int a=0;
        if (ques.length()==0){
            System.out.println(ans+" ");
            return 1;
        }
        char ch=ques.charAt(0);
        String press=arr[ch-48];
        for (int i = 0; i < press.length(); i++) {
          a+=  phoneclick(arr,ques.substring(1),ans+press.charAt(i));
        }
        return a;

    }
}
