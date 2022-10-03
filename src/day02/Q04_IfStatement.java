package day02;

import java.util.Scanner;

public class Q04_IfStatement {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Y yada N giriniz");
        char karakter = scan.next().charAt(0);// charAt git ilk karakteri al gel demek

        if (karakter == 'Y' || karakter == 'y'){
            System.out.println("YES");
                    }
        else if (karakter == 'N' || karakter == 'n'){
            System.out.println("NO");

        }
        else System.out.println("Yanlış giriş tekrar deneyin");






    }


}
