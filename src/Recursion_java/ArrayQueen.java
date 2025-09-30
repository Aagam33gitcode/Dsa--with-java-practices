package Recursion_java;

import java.util.ArrayList;
import java.util.List;

public  class ArrayQueen {
    public static void main(String[] args) {
        List<String> ss=new ArrayList<>();
        List<String> pp=new ArrayList<>();
        int tq=2;
        int n=4;
        boolean[] arr=new boolean[n];
    queenArange(arr,tq,0,"",ss);
        System.out.println(ss+" ");
    queenArangewithcombinataion(arr,tq,0,"",0,pp);
        System.out.println(pp+" ");
    }
    public  static void queenArange(boolean[] arr,int tq,int qsf,String ans, List<String> ss){
if(tq==qsf){
//    System.out.println(ans);
    ss.add(ans);
    return;
}
        for (int i = 0; i < arr.length; i++) {
        if(arr[i]==false) {
        arr[i]=true;
        queenArange(arr,tq,qsf+1,ans+" B"+i+" Q"+qsf,ss);
        arr[i]=false;
        }
        }


    }
    public  static void queenArangewithcombinataion(boolean[] arr,int tq,int qsf,String ans, int idx, List<String> pp){
        if(tq==qsf){
//            System.out.println(ans);
            pp.add(ans);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(arr[i]==false) {
                arr[i]=true;
                queenArangewithcombinataion(arr,tq,qsf+1,ans+" B"+i+" Q"+qsf,i+1, pp);
                arr[i]=false;
            }
        }


    }

}

