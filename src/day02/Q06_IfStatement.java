package day02;

import java.util.Scanner;

public class Q06_IfStatement {
    public static void main(String[] args) {
        /*
   not hesaplayici
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz
     write a program that:
        1. 0 ~12 ==> good morning
        2. 12 ~ 15 ==> good afternoon
        3. 15 ~ 23 ==> good night
        4. 12 ==> good noon
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = scan.nextInt();
        if (not>=90 && not<100){
            System.out.println(" A ");
        }else if (not>=80 && not<89){
            System.out.println(" B ");}
        else if (not>=70 && not<79){
            System.out.println(" C ");}
        else if (not>=60 && not<69){
            System.out.println(" D ");}
        else if (not>=0 && not<59){
            System.out.println(" E ");}





    }

}
