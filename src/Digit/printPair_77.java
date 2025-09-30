package Digit;

import java.util.ArrayList;
import java.util.List;

public class printPair_77 {
    public static void main(String[] args) {
        List<Integer> ans =new ArrayList<>();
         pritpi(1,4,2,ans);
        System.out.println(ans);
    }
    public static void pritpi(int idx,int n,int k,List<Integer> ans){
//int count=0;
//        for (int i = 1; i <n; i++) {
//            for (int j = i+1; j <=n ; j++) {
//                System.out.print(i+","+j+" ");
//                count++;
//
//            }
//            System.out.print(" ");
//            System.out.println(count);

        if(ans.size()==k){
            ans.add(idx);
            return;
        }

        for (int i=idx; i <=n ; i++) {

            pritpi(i+1,n,k,ans);
        }}

}
