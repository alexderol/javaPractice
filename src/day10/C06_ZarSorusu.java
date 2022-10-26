package day10;

public class C06_ZarSorusu {
    /*
    iki tane atılan zarin toplamlarinin 9 olmasi durumuda "Kazandiniz" yazısini yazdırın, aksi takdirde " tekrar deneyiz" yazdırın

     */
    public static void main(String[] args) {

        ///int randomNum = (int) (Math.random() * ((max - min) + 1)) + min; formül bu
        int zar1 = (int) (Math.random() * ((6 - 1) + 1) + 1);//formül bu şekilde
        System.out.println("zar1 = " + zar1);
        int zar2 = (int) (Math.random() * ((6 - 1) + 1) + 1);
        System.out.println("zar2 = " + zar2);
        System.out.println((zar1 + zar2 == 9) ? "Kazandiniz" : "Tekrar deneyin");


    }
}
