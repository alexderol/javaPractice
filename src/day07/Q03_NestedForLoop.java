package day07;

import java.util.Scanner;

public class Q03_NestedForLoop {
    public static void main(String[] args) {
        //girilen sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırın.
        //girilen sayı dahil tek ise tek olanları adet yazdıralım

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girin");
        ;
        int say = scan.nextInt();
        int adet = 0;
        while (say > 0) {
            if (say % 2 == 1) {
                System.out.println(say + " ");
                adet++;
            }say--;
        }
        System.out.println();
        System.out.println("adet= " + adet);


    }
}

