package String;

public class Axis_Orbit_647 {
    public static void main(String[] args) {
String s="aaa";
        System.out.println(axob(s));
    }
    public  static int axob(String  s){
        //odd length
        int count=0;
        for (int axis = 0;axis <s.length() ; axis++) {
            for (int orbit = 0; axis-orbit>=0&&axis+orbit<s.length(); orbit++) {
                if(s.charAt(axis-orbit)==s.charAt(axis+orbit)){
                    count ++;
                }
                break;
            }
        }
        //even length
        for (double axis = 0.5;axis <s.length() ; axis++) {
            for (double orbit = 0.5; axis-orbit>=0&&axis+orbit<s.length(); orbit++) {
                if(s.charAt((int) (axis-orbit))==s.charAt((int) (axis+orbit))){
                    count ++;
                }
                break;
            }
        }

    return count;}
}
