package day04;

import java.util.Scanner;

public class Q12_StringManipulation {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String word = scan.nextLine();
       //if (word.contains(" ")){
       //    System.out.println("girdi boşluk  içeriyor");
       //}if (word.length()>=0){
       //    System.out.println("girdi  dutluk değil :)");
       //}else if (word.length()==0) System.out.println("girdi dutluk :)");
        int bosluk = word.indexOf(" ");//boşluğun olup olmadığını -1 ise boşluk yoktur demek yani olmayan bir karakterin yokluğunda -1 döner

        if (bosluk==-1 && !word.isEmpty())//boşluk karakteri yoksa ve strign ifadem bos değilse demek çok önemli burası özellikle word ün önüne konan ! ilk kez gördüm
        {
            System.out.println("sartlara uygun");

        }else System.out.println("şartlara uygun değildir");







    }


}