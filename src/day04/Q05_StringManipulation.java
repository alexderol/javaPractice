package day04;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        // kullanıcıdan 4 kelime isteyin bir cümle ve sonuna . koyarak çıktı alın
        // ilk kelimenin ilk harfi büyük yazsın
        // cesaret, insana, sinirlarini, ögretir
        //Cesaret insana sinirlarini öğretir.



        Scanner scan = new Scanner(System.in);
        System.out.println("dört adet kelime giriniz");
        String word1= scan.nextLine(), word2= scan.nextLine(), word3= scan.nextLine(), word4= scan.nextLine();
        String unity= word1.substring(0,1).toUpperCase().concat(word1.substring(1)).concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(".");
        System.out.println(unity);//bunu concatsız da yapabilirdik hatta yarın yap



    }
}
