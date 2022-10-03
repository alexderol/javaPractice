package day04;

import java.util.Scanner;

public class Q09_StringManipulation {
    /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String word = scan.nextLine();
        if (word.length() % 2 != 0 && word.length() >= 3) {
            System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));
        } else System.out.println("girilen kelime çift sayıda karakter içeriyor");


    }

}
