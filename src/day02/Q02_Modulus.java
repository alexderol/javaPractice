package day02;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {

        /*   ***********  interviewww sorusu *******



         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz = ");
        int sayi = scan.nextInt();
        //sayı 12345 olsun
        int ilkiki = sayi/1000;//12 oldu şimdi 12 yi de 1+2 olacak şekilde bulman gerek 1 için
        int a= ilkiki%10;
        int b = ilkiki/10;
        int soniki = sayi%100;// son iki 45 bunun da 4 ve 5 i ayrı ayrı bulmak için aşağıdaki gibi yaptık
        int c = soniki%10;
        int d = soniki/10;
        int toplam = ilkiki+soniki;
        System.out.println("sayının ilk iki ve son iki basamağı toplamı = " + (a+b+c+d));














    }


}
