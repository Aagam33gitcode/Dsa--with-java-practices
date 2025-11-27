package String;

public class Anagram {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="bcadef";
        System.out.println(anagramString(s1,s2));


    }
    public static boolean anagramString(String s1,String s2){
        int[] frequency= new int[26];
        int idxA=0;
        int idxB=0;
        if (s1.length()!=s2.length()){
            return false;
        }
        while (idxA<s1.length()&&idxB<s2.length()){
        char charA=s1.charAt(idxA);
        int freqA=charA-97;
        frequency[freqA]++;
        char charB=s2.charAt(idxB);
        int freqB=charB-97;
        frequency[freqB]--;
        idxB++;
        idxA++;
    }
        for (int j : frequency) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

}
