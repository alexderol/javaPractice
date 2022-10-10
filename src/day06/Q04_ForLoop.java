package day06;

import java.util.Scanner;

public class Q04_ForLoop {
    public static void main(String[] args) {
        /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
            hesaplayan kodu yazın
         Örnek Ekran Çıktısı
         Girilen sayı=4
         Kareler toplamı=14
          */

        Scanner scan = new Scanner(System.in);
        System.out.print("1 den büyük bir tam sayı girin");

        int sayi= scan.nextInt();
        int kareToplam=0;

        for (int i = 1; i <sayi ; i++) {
            kareToplam+=i*i;

        }
        System.out.println(kareToplam);



    }

}
