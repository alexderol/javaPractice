package day04;

import java.util.Scanner;

public class Q02_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayrı değer giriniz ve bu iki kelime method kullanarak birleştiriniz
        //Yukarıdaki örnekte verilen ilk ve ikinici deşikenlerinin ilk harflerini atıp birleştirniz

        Scanner scan = new Scanner(System.in);
        System.out.println("iki tane ardı ardına kelime giriniz");
        String word1= scan.nextLine();
        String word2 = scan.nextLine();
        System.out.println("1. method birleştirimi= "+word1+" "+word2);
        System.out.println("2. method birleştirimi = "+ word1.concat(" "+word2));
        //sorunun ikinci kısmı aşağıda
        String ilkKarakteryok= word1.substring(1).concat(word2.substring(1));
        System.out.println("ilkKarakteryok = " + ilkKarakteryok);



    }
}
