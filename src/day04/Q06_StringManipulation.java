package day04;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String word = scan.next().toLowerCase();
        if (word.startsWith("gh")) {//girilen kelime gh ile başlıyorsa hepsini yazdır
            System.out.println(word);
        } else if (word.startsWith("g")) {//
            System.out.println(word.charAt(0) + word.substring(2));//g varsa g yi yaz ancak ikinci karakteri alma dediğimiz için sub2 yaptık

        } else if (word.charAt(1) == 'h') {
            System.out.println(word.substring(1));//yani ikinci harf h ise ilk harfi yazdırma sonraları yazdır
        } else System.out.println(word.substring(2));//gh yoksa kelimede ilk iki harfi yazdırma dedik


    }

}
