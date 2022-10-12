package dayForMe;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("baklava dilimi boyutu için bir sayı giriniz");
        int boyut = scan.nextInt();



        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *



         *///yıldızın üst tarafı
        for (int i = 1; i <=boyut ; i++) {
            for (int j = boyut; j >i ; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
        //alt
        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = boyut; j >i ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }


















       /* //baslava üst kısım
        for (int i = 1; i <= 5; i++) {
            for (int b = 5; b > i; b--) {
                System.out.print(" ");

            }
            for (int y = 1; y <= i; y++) {//
                System.out.print("*" + " ");

            }
            System.out.println();


        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {//bulut
                System.out.print(" ");

            }
            for (int j = 5; j > i; j--) {
                System.out.print("*" + " ");

            }
            System.out.println();


        }
        */

        }
    }





