package day5;

import java.util.Scanner;

public class Q04_MethodCreation {
    /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı giriniz  ");
        int sayi= scan.nextInt();

        System.out.println("Sayı tek mi cift mi "+Q02_MethodCreation.isEven(sayi));
        pozitifmi(sayi);
        yüzdenbuyukmu(sayi);



    }

    private static void yüzdenbuyukmu(int a) {
        int birler=a%2;
        int onlar=(a/10)%10;
        int yüzler= (a/100)%10;
        if (a>100){
            System.out.println("basmaklar toplamı = "+(birler+onlar+yüzler));

        }else System.out.println("sayının birler basamağı ="+birler);
    }

    private static String pozitifmi(int a) {

        return a>0 ? "pozitif" : "negative" ;
    }

}
