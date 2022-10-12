package day08;

public class ex02_Fahrenayt {
    public static void main(String[] args) {
        /*
        Task-->For döngüsü kullanarak 50 ile 60 dereceleri arasını fahrenheit cinsinden ekrana yazdırınız.
        formül= f = c * 1.8 + 32
         */

        for (int c= 50; c <=60;c++){
            double f= c * 1.8 + 32;
            System.out.println(c+" Derece = "+f+" Fahrenheit");

        }




    }
}
