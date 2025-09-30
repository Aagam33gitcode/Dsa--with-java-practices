package Practics;

public class StringChange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 2, 3, 2};
        String[] digitWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String str1 = "010101010";
        String Str2 = "100110101";
        String ss = "0";
        for (int i = 1; i < str1.length(); i++) {
            if (str1.charAt(i) == Str2.charAt(i)) {
                ss += "0";
            } else
                ss += "1";

        }
        System.out.println(ss);

//        System.out.println(fibonaaci(4));
//  oddEven(2345);
//        System.out.println(winGame(5,15));
//printIndex(arr, 0,2);
//numberTOword(digitWord,3432);
//System.out.println(lengthString("asdfgh"));
//String ss1="abcab";System.out.println(countSubstrs(ss1,0,ss1.length()-1,ss1.length()));
        TOH(3, "src", "help", "des");

    }

    public static int fibonaaci(int n) {
        int ans = 0;
        if (n == 0 || n == 1) {
            return n;
        }
        for (int i = 2; i < n; i++) {
            ans += i;

        }
        return ans;
    }

    public static void oddEven(int n) {
        System.out.println("Number is: " + n);
        int p = 1;
        int oddSum = 0;
        int EvenSum = 0;
        while (n > 0) {

            if (p % 2 == 0) {
                EvenSum += n % 10;
                n = n / 10;
            } else {
                oddSum += n % 10;
                n = n / 10;
            }
            p++;
        }
        System.out.println("oddSum: " + oddSum);
        System.out.println("EvenSum: " + EvenSum);
    }

    public static String winGame(int n, int m) {
        int Xsum = 0;
        int Ysum = 0;
        int x = 0;
        int y = 0;
        while (Xsum != n && Ysum != m) {
            x++;
            Xsum = Xsum + x;
            y = x + 1;
            Ysum = y + x;
            if (Ysum >= m) {
                return "win X";
            }
            if (Xsum > n) {
                return "Win Y";
            }
        }
        return "draw";
    }

    public static void printIndex(int[] arr, int i, int key) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i + ": " + key);
        }
        printIndex(arr, i + 1, key);
    }

    public static void numberTOword(String[] arr, int number) {

        if (number == 0) {
            return;
        }
        int last = number % 10;
        numberTOword(arr, number / 10);
        System.out.print(arr[last] + " ");

    }

    public static int lengthString(String str) {
        int count = 0;

        boolean flag = true;
        if (str.length() == 0) {
            return 0;
        }
        int f1 = lengthString(str.substring(1)) + 1;
        count++;
        return f1;
    }

    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1)
                + countSubstrs(str, i, j - 1, n - 1)
                - countSubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void TOH(int n, String src, String hlp, String disc) {

        if (n == 0) {
            return;
        }

        TOH(n - 1, src, disc, hlp);
        System.out.println("move " + n + "th " + "from " + src + " to " + disc);
        TOH(n - 1, hlp, src, disc);


    }
}