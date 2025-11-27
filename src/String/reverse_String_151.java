package String;

import java.util.Arrays;
import java.util.Collections;


public class reverse_String_151 {
    public static void main(String[] args) {
    String s="  a apple is  red  ";
        System.out.println(reverse3(s));
        System.out.println(reverse2(s));
        System.out.println(hello(s));
        System.out.println(reverse(s));

    }
    public static String hello(String s){
        s = s.trim();
        String[] words = s.split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
}
public static String reverse(String s){

        String res="";
        String[] arr=s.trim().split(" ");
    for (int i = arr.length-1; i >=0 ; i--) {
        if (arr[i].isEmpty()){
            continue;
        }
        if (res.isEmpty()){
            res=arr[i];
        }else{
            res+=" "+arr[i];
        }

    }return res;
}
public static String reverse2(String s){

        String[] arr= s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i].isEmpty()){
                continue;
            }
            if (sb.length()==0){
                sb.append(arr[i]);
            }else{
                sb.append(" ");
                sb.append(arr[i]);
            }
//                res+=" "+arr[i];
            }

        return sb.toString();}
    public static String reverse3(String s){

//        String[] arr= s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
int start=s.length()-1;
while (start>=0) {
    while (start>=0&&s.charAt(start) == ' ') {
        start--;
    }
    if (start<0){
        break;
    }
    int end=start;
    while (start>=0&&s.charAt(start)!=' '){
        start--;
    }
    if (sb.isEmpty()){
        sb.append(s.substring(start+1,end+1));
    }else{
        sb.append(" ");
        sb.append(s.substring(start+1,end+1));
    }

}return sb.toString();
      }


}
