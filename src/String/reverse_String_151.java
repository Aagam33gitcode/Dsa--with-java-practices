package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class reverse_String_151 {
    public static void main(String[] args) {
    String s="a apple is  red";
        System.out.println(hello(s));}
    public static String hello(String s){
        s = s.trim();

        String[] words = s.split("\\s+");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
}}
