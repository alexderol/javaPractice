package day04;

import java.util.Scanner;

public class Q13_StringManipulation {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("4 hafli kelime girin");
        String word = scan.nextLine();
        if(word.length()<=4){
        System.out.println("Girilen kelimenin ters yazdırılmış hali ="+word.substring(word.length()-1)+word.substring(2,3)+word.substring(1,2)+word.substring(0,1));}
        else System.out.println("4 hafli bir kelime giriniz");




    }

}