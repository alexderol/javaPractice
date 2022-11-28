package day21_11_22;

import java.util.Arrays;

public class Q02_R {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {
        int [] arr = new int [10];

        randomEkleBakalım(arr);


    }

    private static void randomEkleBakalım(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*20);
            if(arr[i]% 2 == 0) arr[i]=111;
            if(arr[i]% 2 != 0) count++;

        }
        if(count==0) System.out.println("çif sayı yok");
        else System.out.println(Arrays.toString(arr));
    }
}
