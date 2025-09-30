package String;

public class valid_Palindrome_String_125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrom(s));

    }
    public static boolean isPalindrom(String s){
        int j=s.length();
        for (int i = 0; i < j; i++) {
            j--;
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }

        return true;

    }
}
