package day04;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
        //Kullanıcıdan ismini ve soyisimni girmesinii isteyin sonrasında konsola tam ismini buyuk hafrler ile yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad soyad gir");
        String name= scan.nextLine(), lastname = scan.nextLine();// iki data böyle deyazılabilir
        String fullName = name.concat(" " + lastname).toUpperCase();
        System.out.println("fullName = " + fullName);


    }

}
