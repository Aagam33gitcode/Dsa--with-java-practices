package time_and_Space;

public class time_complex {
    public static void main(String[] args) {
        long start= System.currentTimeMillis();
        for (int i = 0; i < 1000_000; i++) {
            System.out.print(i+",");
        }
        System.out.println();
        long end=System.currentTimeMillis();


        System.out.println(end-start);
    }
}
