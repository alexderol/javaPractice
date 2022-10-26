package StudentCodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01_Merve_ArrayList {

    /*
     Write a Java program to separate odd and even numbers of a given array of integers.
    Put all odd numbers first, and then even numbers.
     example: int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
     */
    public static void main(String[] args) {


        int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        System.out.println("sayi = " + Arrays.toString(sayi));

        ArrayList<Integer> sıralı = new ArrayList<>();

        tekCiftAyırma(sayi, sıralı);








    }

    private static ArrayList<Integer> tekCiftAyırma(int [] sayi, ArrayList<Integer> sıralı) {
        for (int a:sayi ) {// foreahc yaptık
            if(a%2==1){// tek sayıları aldık ve liste ekledik
                sıralı.add(a);
            }

        }
        System.out.println("sıralı tek sayılar  = " + sıralı);//bak bakalım tekler gelmiş mi

        for (int b : sayi) {
            if(b%2==0){
                sıralı.add(b);
            }


        }
        System.out.println("sıralı tek ve çift birleşti = " + sıralı);
// arrayliste de eklenen hep sona gelir dolayısıyla taskta tekleri ve çiftleri ayırdık önce tekleri yazdırdık liste sonra çiftleri yazdırdık

        return sıralı;
    }


}
