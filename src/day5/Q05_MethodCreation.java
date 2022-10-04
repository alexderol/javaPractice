package day5;

import java.util.Scanner;

public class Q05_MethodCreation {
    static Scanner sc = new Scanner(System.in);
    //Kullaniciya kac sayi toplamak istedigini sorun.
    //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
    //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
    //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz
    public static void main(String[] args) {
        System.out.println("kac sayi toplama istiyorsunuz : ");
        int adet = sc.nextInt();
        if(adet<2){
            System.out.println("En az 2 sayi girmelisiniz");
        }else if(adet==2){
            ikiSayiTopla();
        }else if(adet==3){
            System.out.println(ucSayiTopla());
        }else if(adet==4){
            dortSayiTopla();
        }else System.out.println("cok sayi girdiniz, ben toplayamam");
    }
    private static void dortSayiTopla() {
        System.out.println("dort sayi giriniz :");
        double sayi1 = sc.nextDouble();
        double sayi2 = sc.nextDouble();
        double sayi3 = sc.nextDouble();
        double sayi4 = sc.nextDouble();
        System.out.println("dort sayinin toplami :" + (sayi1 +sayi2+sayi3+sayi4));
    }
    private static double ucSayiTopla() {
        System.out.println("uc sayi giriniz :");
        double sayi1 = sc.nextDouble();
        double sayi2 = sc.nextDouble();
        double sayi3 = sc.nextDouble();
        return sayi1+sayi2+sayi3;
    }
    private static void ikiSayiTopla() {
        System.out.println("iki sayi giriniz :");
        double sayi1 = sc.nextDouble();
        double sayi2 = sc.nextDouble();
        System.out.println("iki sayinin toplami :" + (sayi1+sayi2));
    }

}
