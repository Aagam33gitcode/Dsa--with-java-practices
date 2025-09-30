package String;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int count=0;

//        for (int i = 1; i <= 6; i++) {
//            count++;
//            System.out.print(" "+ count+" ");
//
//
//        }
//        System.out.println(count);


//        while (n>0){
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);



//        int sumofdigits=0;
//        int n1=n;
//        while(n1>0){
//            sumofdigits=sumofdigits+n%10;
//            n1=n1/10;
//
//
//        }
//        System.out.println(n+" ,"+sumofdigits);
//
//        int ans=0;
//        while(n>0){
//            ans=ans*10+n%10;
//            n=n/10;
//
//        }
//        System.out.println(ans);

//int ans=0;
//for(int i=1;i<=n;i++){
//    if(i%2==0){
//        ans-=i;
//
//    }
//    else{
//        ans+=i;
//    }
//
//}
//        System.out.println(ans);

//
//
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//
//        }
//        System.out.println(fact
//        );



        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        for(int i=1; i<=b;i++){
            ans*=a;

        }
        System.out.println(ans);


























    }

}
