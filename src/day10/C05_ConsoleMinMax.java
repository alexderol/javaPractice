package day10;

import java.util.Scanner;

public class C05_ConsoleMinMax {
    public static void main(String[] args) {

        //Console üzerinden maximum ve minimum değeri sağlayınız
        //ve buradan gelen rakamları Math.random() da olmasini istediğinizi aralğı getiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi1 girin");
        int sayi1 = scan.nextInt();
        System.out.println("sayi2 girin");
        int sayi2 = scan.nextInt();

        System.out.println("Math.max(sayi1,sayi2) = " + Math.max(sayi1, sayi2));///sayi1 mi max yoksa sayi2 mi max bunu verir bize

        int random;
        if (sayi1 > sayi2) {//eğer sayi1 büyükse max değer sayi1 e kadar olsun demek
            random = (int) (Math.random() * sayi1);
            System.out.println("random= " + random);
        } else
            random = (int) (Math.random() * sayi2);//buranın açıklaması yukarıda
        System.out.println("random= " + random);

        //2. yol
        int randomNum =(int) (Math.random() * ((Math.max(sayi1,sayi2) - Math.min(sayi1,sayi2)) + 1)) + Math.min(sayi1,sayi2);
        System.out.println("randomNum = " + randomNum);


    }
}
