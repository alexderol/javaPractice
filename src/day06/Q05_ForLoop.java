package day06;

import java.util.Scanner;

public class Q05_ForLoop {
    /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("diktörtgen için satır sayısı girin");
        int satır= scan.nextInt();
        System.out.println("diktörtgen için sütun sayısı girin");
        int sütun= scan.nextInt();
        for (int i = 1; i <= satır; i++) {
            for (int j = 0; j <=sütun ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }



    }


}
