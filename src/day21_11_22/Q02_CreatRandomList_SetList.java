package day21_11_22;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02_CreatRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {
        int[] arr = new int[10];
        randomEkle(arr);
        ArrayList<Integer> list = new ArrayList<>();
        radomekleArrayList(list);


    }

    private static void radomekleArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, 111);
            } else {
                count++;
            }
            if(count==0){
                System.out.println("çift yok");
            }
        }

        System.out.println(list);
    }


    private static void randomEkle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 111;
            } else
                System.out.println("çift sayı yoktur");

        }

        System.out.println(Arrays.toString(arr));

    }


}
