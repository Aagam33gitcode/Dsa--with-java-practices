package String;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class AxisOrbitPalindrom {
    public static void main(String[] args) {
        List<String> ans=new ArrayList<>();
        System.out.println(countPlaindrom1("NITIN", ans));
        countPlaindrom1("NAAN", ans);
        System.out.println(ans);
    }
    public static int countPlaindrom(String s){
        int count =0;
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis-orbit>=0&&axis+orbit<s.length(); orbit++) {
                if (s.charAt(axis-orbit)==s.charAt(axis+orbit)){
                    count++;
                }
            }
        }
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double  orbit = 0.5;  axis-orbit>=0&&axis+orbit<s.length(); orbit++) {
                if (s.charAt((int) (axis-orbit))==s.charAt((int) (axis+orbit))){
                    count++;
                }
            }
        }
        return count;
    }
    public static List<String> countPlaindrom1(String s, List<String> ans){
               int count =0;
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis-orbit>=0&&axis+orbit<s.length(); orbit++) {

                if (s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
break;
                }
                ans.add(s.substring(axis-orbit,axis+orbit+1));
            }
        }
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double  orbit = 0.5;  axis-orbit>=0&&axis+orbit<s.length(); orbit++) {
                if (s.charAt((int) (axis-orbit))!=s.charAt((int) (axis+orbit))){
                    count++;
                    break;
                }
                ans.add(s.substring((int) (axis-orbit),(int) (axis+orbit+1)));
            }
        }
        return ans;
    }
}
