package day04;

import java.util.Scanner;

public class Q13_StringManipulation {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("4 hafli kelime girin");
        String word = scan.nextLine();
        System.out.println(word.substring(word.length()-1)+word.substring(2,3)+word.substring(1,2)+word.substring(0,1));




    }

}