package Recursion_java;

import java.util.ArrayList;
import java.util.List;

public class parantheses {

    public static void main(String[] args) {

        List<String> ll = new ArrayList<>();
        print_paran(3, 0, 0, "", ll);
        System.out.println(ll);
        printparantheses(3, 0, 0, "");
        System.out.println();



    }

    public static void print_paran(int n, int open, int close, String ans, List<String> ll) {
        if (open == n && close == n) {
            ll.add(ans);
            return;
        }
        if (open < n) {
            print_paran(n, open + 1, close, ans + "(", ll);
        }
        if (open > close) {
            print_paran(n, open, close + 1, ans + ")", ll);
        }
    }

    public static void printparantheses(int n, int open, int close, String ans) {
        if (open == n && close == n) {
            System.out.print(ans + " ");
            return;
        }
        if (close < open) {
            printparantheses(n, open, close + 1, ans + ")");
        }
        if (open < n) {
            printparantheses(n, open + 1, close, ans + "(");
        }
    }











}
