package StudentCodeChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_Merve_Dizi {
    /*
Java N ve M Boyutlu Dizinin Satırlarının Toplamını Bulma

Bu örnekte N ve M değerlerini kullanıcıdan alıp, iki boyutlu dizi oluşturacağız.
 Daha sonra da dizinin elemanlarını kullanıcıdan alıp, her satırın sonuna o satırın toplamını yazdıracağız.


 örneğin;

 12    12     24
 5     15     20
 12    18     30

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam;

        System.out.println(" Dizinin satır sayısın giriniz");
        int satır=scan.nextInt();

        System.out.println("dizinin sütun sayısını giriniz");
        int sütun= scan.nextInt();

        int sayı [][]=new int[satır][sütun];// iki boyutlu arrayı satır ve sütun uzunluklarını aldık

        for (int i = 0; i < satır; i++) {
            for (int j= 0; j< sütun; j++){

                System.out.println(" bir sayı gir");
                sayı[i][j]= scan.nextInt();


            }

        }//burada Array oluşturduk
        System.out.println(Arrays.deepToString(sayı));

        System.out.println("girilen dizi\n");
        for (int i= 0; i<satır; i++){
            toplam=0;// kullanıcının girdiği değerleri toplamak için iki for arasına koyduk çünkü her döngüde 0 olsun istiyoruz
            for (int j = 0; j < sütun; j++) {
                toplam+=sayı[i][j];
                System.out.print(sayı[i][j]+"\t");

            }
            System.out.println(toplam+"\n");// en son satırda topladığım değerleri satır sonuna yazdırdık
        }



    }

}
