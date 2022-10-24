package day10xxx;

import java.util.ArrayList;
import java.util.List;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int [] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int n=2;
        // list oluşturalım
        List<Integer> list = new ArrayList<>();
        for (Integer each:arr) {
            list.add(each);

        }

        List<Integer> maxList = new ArrayList<>();
        int count=0;

        while (count<n){// max liste eklenecek eleman kontrolu yaptık
            int max= list.get(0);

            for (int i = 0; i < list.size(); i++) {

                if(list.get(i)>max){// listedeki herhangi bireleman max dan büyükse o  max olsun demek
                    max= list.get(i);//
                }


            }
            maxList.add(max);
            list.remove(list.indexOf(max));//ayni buyuk sayi olmaması için  bululnan en buyuk sayiyi ilk listten siler
            count++;


        }
        System.out.println(" Arrayin ilk "+n+" max degerleri " + maxList);









    }
}
