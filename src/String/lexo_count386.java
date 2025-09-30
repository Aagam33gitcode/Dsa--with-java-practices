package String;

import java.util.ArrayList;
import java.util.List;

public class lexo_count386 {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        lexo_count(0,13,ans);
        System.out.println(ans);
    }
    public static void lexo_count(int crr, int n, List<Integer> ans){

        if(crr>n){

            return;
        }

        ans.add(crr);
        int i=0;
        if(crr==0){
            i=1;
        }

        for (; i <10 ; ++i) {

            lexo_count(crr*10+i,n,ans);
        }


    }

}
