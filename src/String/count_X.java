package String;

public class count_X {
    public static void main(String[] args) {
        System.out.println(count_ways(3));
    }
    public  static int count_ways(int n){
        if(n==1||n==2){
            return n+1;
        }
        return count_ways(n-1)+count_ways(n-2);
    }

}
