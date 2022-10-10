package day06;

import java.util.Scanner;

public class Q08_ForLoop {
    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayıyı yazın");
        int ilk= scan.nextInt();
        System.out.println("ikinci sayıyı yazın");
        int ikinci= scan.nextInt();

        int toplam=0;

        if(ilk<ikinci){
        for (int i = ilk; i <=ikinci ; i++) {
            toplam+=i;


        }
            System.out.println("iki sayı arasındaki sayıların toplamı= "+toplam);
        } else if (ilk>ikinci) {
            for (int i = ikinci; i <=ilk ; i++) {
                toplam+=i;

            }
            System.out.println("iki sayı arasındaki sayıların toplamı= "+toplam);

        }else System.out.println("sayılar eşit");
    }

}
