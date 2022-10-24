package day10;

import java.util.Random;
import java.util.Scanner;

public class C2_MathClassMatrix {

    /*
    Ask user to enter a number and print on console nubre by number matrix

    Example :
    intputX:10

    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0


     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("matrisin boyutu girin");
        int sayi= scan.nextInt();

        Random random= new Random();
        for (int i = 0; i < sayi; i++) {// outer for- satır
            for (int j = 0; j < sayi; j++) {// inner for --sütun
                System.out.print((int) (Math.random()*2)+" ");// bu Math classından aldık
                System.out.print(new Random().nextInt(2)+" ");///bunu yazmak için önce random objesini oluşturmamız gerekiyor 32 satırda oluşturduk

            }
            System.out.println();

        }

    }



}
