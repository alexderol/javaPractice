package day04;

public class Q08_StringManipulation {
    public static void main(String[] args) {
        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.
        String s = "   Java ogrenmek123 Cok guzel@      ";
        s = s.replaceAll("\\d", "")// yazdığımızda "   Java ogrenmek Cok guzel@      " olacak
                .replace("@","")//burada @ işaretini yok ettik
                .replace("C","c")//C yi küçülttük
                .trim();
        System.out.println(s);


    }


}
