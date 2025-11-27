package String;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println(reverse("ABCDE"));
        System.out.println(reverse2("ABCDE"));
        String s=" Aagam, Amit, Sanjay, Mohit, Vishal   ";
        String trim = s.trim();
        System.out.println(s);
        System.out.println(trim);
        String[] ans=s.trim().split(",");
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i!=ans.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
        String s1="aagamjain.aj@gmail.com";
        String s2="amitsharma@spymail.com";

        String[] ans1=s1.trim().split("@");
        System.out.println(ans1[0].length());

//        String s3="";
//        for (int i = 13; i <s1.length();  i++) {
//            if (s1.charAt(i)=='.') {
//                break;
//            }
//           s3= s3.concat(String.valueOf(s1.charAt(i)));
//        }
//        System.out.println(s3);
        int startIdx=ans1[0].length();
        System.out.println(startIdx);
        int endIdx=s1.lastIndexOf('.');
        System.out.println(endIdx);
        System.out.println(s1.substring(startIdx+1,endIdx));

        double nums=87.6523;
        System.out.printf("Number round of at 2nd place %.2f\n",nums);
        String adress="Patel Nager";
        System.out.printf("Number 2nd place %.2f and adresss %s\n",nums,adress);
        System.out.printf("Number round of at 2nd place %.2f \n",nums);
        String name=String.format("number is %2$f and address is %1s",adress,nums);
        System.out.println(name);

    }
    //practics
    public static String reverse(String s){
        String ans="";
        for (int i = s.length()-1; i>=0; i--) {
            ans=ans+s.charAt(i);
        }
        return ans;
    }
    // 2.Practics
    public static String reverse2(String s){
        int i=0;
        int j=s.length()-1;

        StringBuilder sb=new StringBuilder(s);
        while (i<j){
            char a1=sb.charAt(i);
            char a2=sb.charAt(j);
            sb.setCharAt(i,a2);
            sb.setCharAt(j,a1);

            i++;
            j--;
        }
        return sb.toString();
    }


}
