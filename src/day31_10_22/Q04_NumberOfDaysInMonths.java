package day31_10_22;

import java.time.LocalDate;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {
    /*
Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.
 */
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl = scan.nextInt();
        System.out.println("ay giriniz");
        int ay = scan.nextInt();
        LocalDate date =LocalDate.of(yıl,ay,1);
        System.out.println(date.getMonth()+ " "+ date.getYear()+ " "+ date.lengthOfMonth()+ " gündür ");




    }
}
