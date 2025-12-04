package Recursion;

public class finding_path {
    public static void main(String[] args) {
int n=2;
int m=3;
        System.out.println(print_path(0,n-1,0,m-1,"")
);
    }


    public static int print_path(int cc,int ec,int cr,int er,String ans) {
        if(cr==er && cc==ec){
            System.out.println(ans+ " ");
            return 1;
        }
        if(cr>er || cc>ec ){
            return 0;
        }
       int  p1= print_path(cc+1,ec,cr,er,ans+"H");
       int p2= print_path(cc,ec,cr+1,er,ans+"V");
       int count=p1+p2;

   return count; }

}
