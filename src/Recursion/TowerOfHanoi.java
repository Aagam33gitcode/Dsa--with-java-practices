package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3,"src","help","des"));
    }
    public static int towerOfHanoi(int noD,String source,String helper,String destination){
        if (noD==1){
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return 1;
        }
        int a=  towerOfHanoi(noD-1,source,destination,helper);
        System.out.println("Move disk " + noD + " from " + source + " to " + destination);
        int b=towerOfHanoi(noD-1,helper,source,destination);
        return a+b+1;
    }
}
