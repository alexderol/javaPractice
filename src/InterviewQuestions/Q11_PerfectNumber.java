package InterviewQuestions;

import java.util.Scanner;

public class Q11_PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
*/
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz mükemmel mi bakalım");
        int sayi = scan.nextInt();
        perfectNumber(sayi);
        girilenSayıyaKadarHangiPerfectSayılarVar(sayi);





    }

    private static void girilenSayıyaKadarHangiPerfectSayılarVar(int sayi) {

        for (int i = 1; i < sayi ; i++) {
            int toplam=0;
            for (int j = 1; j < i ; j++) {
                if(i%j==0){
                    toplam +=j;

                }

            }
            if(toplam==i){
                System.out.println(sayi+ " içinde -->"+ i + " mükemmel sayisi vardır");
            }

        }



    }

    private static void perfectNumber(int sayi) {
        int top=0;
        for (int i = 1; i < sayi; i++) {
            if(sayi % i == 0){
                top +=i;

            }


        }
        if(top==sayi){
            System.out.println(sayi+" sayı mükemmel");
        }else System.out.println(sayi+" sayi mükemmel değil");



    }

}
