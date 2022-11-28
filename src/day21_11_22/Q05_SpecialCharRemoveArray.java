package day21_11_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q05_SpecialCharRemoveArray {
/*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
    System.out.println("getSum(list) = " + getSum(list));


}

    private static int getSum(ArrayList<String> list) {
      int sum=0;

      for (String w:list){
          String str=w.replace("$","");//dolardan kurtulduk
          sum +=Integer.parseInt(str);//str icindeki elemanları int cevirdik ve işlem yaptık
      }
       if(sum<0){
           return -1;
       }else return sum;
    }

}
