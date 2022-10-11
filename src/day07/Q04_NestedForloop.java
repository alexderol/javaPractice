package day07;

import java.util.Scanner;

public class Q04_NestedForloop {
    /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****

*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girin");
        int sayı= scan.nextInt();

        for (int i = 1; i <=5 ; i++) {//satır kontrolü
            for (int j = 5-i; j >0 ; j--) {//boşluk kontrolü
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {//sütunlara başladık
                System.out.print("*");

            }
            System.out.println();

        }



    }

}
