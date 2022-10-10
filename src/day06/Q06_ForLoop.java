package day06;

import java.util.Scanner;

public class Q06_ForLoop {

    /* Interview Question
 Write a Java program to reverse a string. Use for loop and create a method called
  reverseString */
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println(reverseString());


    }

    private static String reverseString() {//başlangıcı sonu aldık bitişi de başı aldık ve for içinde yazdırdık bu kadar
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime yazın");
        String str= scan.nextLine();
        String tersStr="";

        for (int i = str.length()-1; i >= 0; i--) {
            tersStr+=str.charAt(i);
        }


        return tersStr;
    }


}
