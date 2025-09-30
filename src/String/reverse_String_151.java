package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class reverse_String_151 {
    public static void main(String[] args) {
    String s="a apple is  red";
    s=s.trim();
        List<String> wordList=Arrays.asList(s.split("//s+"));
     Collections.reverse(wordList);
        System.out.println(wordList);
        System.out.println(String.join("",wordList));
    }

}
