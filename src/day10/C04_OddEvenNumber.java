package day10;

import java.util.Random;

public class C04_OddEvenNumber {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //cift sayi ise cift sayi olduğunu , tek sayi ise tek sayi olduğunu yazdırın

// 1. yol
        int random = (int) (Math.random() * 100);
        System.out.println(random);
        if (random % 2 == 0) {
            System.out.println("sayi çift");
        } else System.out.println("sayi tek");
//2. yol
        int min = 1;
        int max = 10000063;

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println("randomNum = " + randomNum);
        System.out.println(randomNum % 2 == 0 ? "çift" : "tek");

//3. yol
        Random rastgele = new Random();
        int randomSayi = rastgele.nextInt(100);
        System.out.println("intSayi = " + randomSayi);
        if (randomSayi % 2 == 0) {
            System.out.println("çift sayı");
        } else System.out.println("tek sayı");
    }
}




