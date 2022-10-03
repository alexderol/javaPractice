package day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim");
        String name = scan.nextLine();
        System.out.println("soyisim gir");
        String nameSecond = scan.nextLine();
        if(name.length()>nameSecond.length()){
            System.out.println("isim soyisimden daha uzun");
        }else if (name.length()==nameSecond.length()){
            System.out.println("isim ve soyisim aynı uzunlukta");
        }else System.out.println("soyisim isimden uzun");


    }


}