package pattern;

public class palindromePar_647 {
    public static void main(String[] args) {
        String  s="nitin";
        System.out.println(  palindromePartion(s));

    }

    public  static int palindromePartion(String s){
        int count=0;
        for(int axix=0;axix<=s.length();axix++) {
            for (int orbit = 0; axix - orbit >= 0 && axix + orbit < s.length(); orbit++) {
                if (s.charAt(axix - orbit) != s.charAt(axix + orbit)) {
                    break;
                }
           count++;}
        }


        for (double axix = 0.5; axix <s.length() ; axix++) {
            for(double orbit=0.5;axix-orbit>=0&&axix+orbit<s.length();orbit++){
                if(s.charAt((int) (axix-orbit))!=s.charAt((int) (axix+orbit))){
                    break;
                }
            count++;
            }

        }
        return count;
    }
}
