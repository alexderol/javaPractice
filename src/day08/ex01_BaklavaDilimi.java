package day08;

import java.util.Scanner;

public class ex01_BaklavaDilimi {
    public static void main(String[] args) {

        /*
        aşağıdaki şekli print eden code create ediniz

         bbbb*
         bbb* *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *



         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" baklva dilimi için bir boyut giriniz");
        int boyut= scan.nextInt();
        // baklva diliminin üst bölgesi
        for (int i = 1; i <=boyut ; i++) {//outer for
            for (int j = boyut; j > i; j--) {//boşluk foru
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {//yıldız foru
                System.out.print("*"+" ");

            }
            System.out.println();
        }
        //baklva diliminin alt kısmı
        for (int i = 1; i <=boyut ; i++) {//outer for
            for (int j = 1; j <=i ; j++) {//boşluk
                System.out.print(" ");
            }
            for (int j = boyut; j >i ; j--) {//yıldız kontrolu
                System.out.print("*"+" ");
            }
            System.out.println();
        }






    }

}
