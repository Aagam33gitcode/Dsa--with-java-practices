package Practics;

import java.util.Scanner;

public class equal_String {
    public static void main(String[] args) {


//        // Check if the lengths of the strings are the same
//        if (str1.length() != str2.length()) {
//            System.out.println("The strings are not the same.");
//        } else {
//            // Compare each character of both strings
//            boolean areSame = true;
//            for (int i = 0; i < str1.length(); i++) {
//                if (str1.charAt(i) != str2.charAt(i)) {
//                    areSame = false;
//                    break;
//                }
//            }
//
//            if (areSame) {
//}                System.out.println("The strings are the same.");
//            } else {
//                System.out.println("The strings are not the same.");
//            }
//
String str="aaasdsdsa";

int count=0;
char taget='a';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == taget) {
                count++;
            }


        }

        System.out.println(count);


//        char last=str.charAt(str.length()-1);
//        System.out.println(last);
//
//    }
    // Calculate the effective number of rotations
        int k=11;
        str="abcR";
        k = k% str.length();  // In case k is larger than the string length

    // Rotate the string (left rotation)

    String rotatedString = str.substring(k) + str.substring(0, k);

    // Print the rotated string
        System.out.println("The rotated string is: " + rotatedString);

    // Close scanner
}
}




