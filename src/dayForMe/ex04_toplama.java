package dayForMe;

import java.util.Scanner;

public class ex04_toplama {
    public static void main(String[] args) {
        /*
        While döngüsünü kullanarak kullanıcının istediği kadar sayıyı toplayabildiği bir uygulama yazın
ÇÖZÜM

         */
        Scanner kullanici = new Scanner(System.in);
        double toplam = 0;
        double girdi = -1;        //0 dersek hiçbir sayıyı toplamaz. şartımız 0 dan farklı olmalı ki döngüden çıksın
        int adet = 1;//birinci sayı sorması için sırayla 0 dan başlamasın diye

        while(girdi != 0) {
            System.out.print("Toplanacak Sayıları Girin (Çıkmak için 0 girin)\n\n");
            System.out.print(adet+". Sayı: ");
            girdi = kullanici.nextDouble();
            toplam += girdi;
            adet++;
            System.out.println("toplam= "+ toplam);
        }
        System.out.println("\n\nToplam: "+toplam);




    }
}
