package day5;

import java.util.Scanner;

public class Q03_MethodCreation {
/*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("bir sayı giriniz (cm): ");
    double sayi= scan.nextDouble();
    System.out.println(metrecevirici(sayi));
    System.out.println(kmcevirici(sayi));


}

    private static double metrecevirici(double sayi) {

        return sayi/100;
    }

    private static double kmcevirici(double sayi) {

        return sayi/100000;
    }

}
