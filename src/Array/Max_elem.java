package Array;



public class Max_elem {
    public static int max(int[] arr, int idx) {
        int ans = Integer.MIN_VALUE;
        if (idx >= arr.length) {
            return -1;
        }
        ans = Math.max(arr[idx], max(arr, idx + 1));
        return ans;

    }

    public static int firstOcuress(int[] arr, int idx, int item) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == item) {
            return idx;
        }
        return firstOcuress(arr, idx + 1, item);
    }

    public static void removeX(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        if (ch != 'x' && ch != 'X') {
            removeX(ques.substring(1), ans + ch);
        } else {
            removeX(ques.substring(1), ans);
        }
    }

    public static void parenth(int n, int open, int close, String ans) {
        if (close == n && open == n) {
            System.out.print(ans + " ");
            return;
        }
        if (open < n) {
            parenth(n, open + 1, close, ans + "(");
        }
        if (open > close) {
            parenth(n, open, close + 1, ans + ")");
        }
    }

    public static void dics(int n, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            ;
            return;
        }
        if (n < 0) {
            return;
        }
//        dics(n-1,ans+"1");
//        dics(n-2,ans+"2");
//        dics(n-3,ans+"3");
        for (int i = 1; i <= n; i++) {
            dics(n - i, ans + i);
        }
    }

    public static void pattern(int n, int total) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < total; i++) {
            System.out.print("*" + " ");

        }
        System.out.println();
        pattern(n - 1, total);
    }

    public static int subSequence(String ques, String ans, int idx) {

        if (ques.isEmpty()) {
            System.out.print(ans + " ");
            return 1;
        }
        char ch = ques.charAt(idx);
        int f1 = subSequence(ques.substring(1), ans + ch, idx + 1);
        int f2 = subSequence(ques.substring(1), ans, idx + 1);
        return f2 + f1;
    }

    public static void subString(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i + 1);
            subString(s1 + s2, ans + ch);
        }
    }

    public static void subString_NoDuplicate(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");

            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            boolean flag = false;
            for (int j = i + 1; j < ques.length(); j++) {
                if (ques.charAt(j) == ch) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                subString(s1 + s2, ans + ch);
            }
        }
    }

    public static void printPath(int cc, int cr, int er, int ec, String ans) {
        if (er == cr && cc == ec) {
            System.out.print(ans + " ");
            return;
        }
        if (cc < ec) {
            printPath(cc + 1, cr, er, ec, ans + "V");
        }
        if (cr < er) {
            printPath(cc, cr + 1, er, er, ans + "H");
        }


    }

    public static void keyPad(String[] code, String ques, String ans) {
        if (ques.isEmpty()) {
            System.out.println(ans + " ");
            return;
        }
        char ch = ques.charAt(0);
        String pres = code[ch - 48];
        for (int i = 0; i < pres.length(); i++) {
            keyPad(code, ques.substring(1), ans + pres.charAt(i));

        }

    }

    public static void lexoorder(int curr, int n) {
        if (curr > n) {
            return;

        }
        System.out.print(curr + " ");
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i < 9; i++) {
            lexoorder(curr * 10 + i, n);

        }
    }

    public static int towerOfH(int n, String src, String help, String des) {

        if (n == 0) {
            return 1;
        }
        int a = towerOfH(n - 1, src, des, help);
        System.out.println("MOve " + n + "th from source to " + des);
        int b = towerOfH(n - 1, des, src, help);

        return a + b;
    }

    public static int friendspair(int n) {
        if (n == 1 || n == 2) {
            return n;

        }
        return friendspair(n - 1) + (n - 1) * friendspair(n - 2);
    }

    public static int sumNaturalSquare(int x,int n,int i){
      int count=0;
       if (x==0){
           return 1;
       }
       if(Math.pow(i,n)>x){
           return 0;
       }

          int a= sumNaturalSquare((int) (x-Math.pow(i,n)), n, i+1);
           int b= sumNaturalSquare( x, n, i+1);
return a+b;
        }
//        System.out.println(count);

    public static void main(String[] args) {
        int[] arr={2,3,21,2,3,3,2,1};
        String[] keypad = {
                "",     // 0 (no letters)
                "",     // 1 (no letters)
                "ABC",  // 2
                "DEF",  // 3
                "GHI",  // 4
                "JKL",  // 5
                "MNO",  // 6
                "PQRS", // 7
                "TUV",  // 8
                "WXYZ"  // 9
        };

//        System.out.println(max(arr,0));
//        System.out.println(Max_elem.firstOcuress(arr,0,34543));
//pattern(4,4);
//        removeX("wexsdrxXXASEAXsj","");
//        System.out.println( subSequence("abc","",0));

//        dics(4,"");
//        Max_elem.parenth(3,0,0,"");
//        Max_elem.subString("abc","");
//        subString_NoDuplicate("aaba","");
//        printPath(1,1,3,3,"");
//        keyPad(keypad,"34","");
//
//lexoorder(0,13);
//        System.out.println(towerOfH(3,"A","B","C"));
//        System.out.println(friendspair(3));
        System.out.println(sumNaturalSquare(1,100,0));
    }
}
