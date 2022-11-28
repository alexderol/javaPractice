package InterviewQuestions;

import java.util.Scanner;

public class Q09_ArmstrongNumber_4Digits {

/*
 Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
     (0, 1, 153, 370, 371, 407, 1634)
     153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
     370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
     1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

     5 basamakli : 54748 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girinz");
        String sayi = scan.next();

        armstrongMethod(sayi);









    }

    private static void armstrongMethod(String sayi) {

        String [] basamak = sayi.split("");
        int top=0;
        for (int i = 0; i < basamak.length; i++) {
            top +=Math.pow(Integer.valueOf(basamak[i]),basamak.length);// string  olan bir basamağı ınteger e çevirdik

        }
        System.out.println(Integer.valueOf(sayi) == top ? " sayi Armstrong sayıdır" : "sayi Armstrong sayı değildir");


    }


}
