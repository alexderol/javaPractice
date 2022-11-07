package day31_10_22;

public class Q05_Varargs02 {
    public static void main(String[] args) {
        carp(1,23,36,55,95,36,36,125);



    }

    private static void carp(int...a ) {
        int carp=1;
        for (int w:a) {
            carp*=w;


        }
        System.out.println("carp = " + carp);
    }
}
