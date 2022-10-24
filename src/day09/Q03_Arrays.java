package day09;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q03_Arrays {

    //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println(" bir cümle girin uzun olsun ");
        String cümle= scan.nextLine();
        String [] arr=cümle.split(" ");
        System.out.println("arr.length = " + arr.length);


    }


}
