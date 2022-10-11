package day07;

import java.util.Scanner;

public class Q05_FoorLoo {
    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int toplam=0;
        int count=0;

        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("sayı gir");
            int sayı= scan.nextInt();
            toplam+=sayı;

            if(toplam>100){
                System.out.println(count+" kere sayı girdin bu kadar yeter");break;
            }




        } System.out.println("toplam= "+toplam);

    }
}
