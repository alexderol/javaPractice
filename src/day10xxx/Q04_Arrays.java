package day10xxx;

import java.util.Arrays;

public class Q04_Arrays {
    public static void main(String[] args) {

        //verilen strini array e veriin ve unlu harflerin sayısını yazdını

        String s =" Apex, nesne yonelimli bir programlama dilidir";

/// bu yolu gözden geçir
        String [] arr= s.split(" ");
        int sayısı=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].toLowerCase().contains("a") || arr[i].toLowerCase().contains("e") || arr[i].toLowerCase().contains("i") || arr[i].toLowerCase().contains("o") || arr[i].toLowerCase().contains("u"))
            sayısı++;
        }
        System.out.println("istenilen harflerin sayısı = " + sayısı);


        //diger çözüm

        s= s.replaceAll(",","" ).replace(" ","");
        String ikinciyol[]= s.split("");
        System.out.println(Arrays.toString(ikinciyol));

        String [] sesliHarfler = {"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliHarfler)); //[a, e, i, o, u]
         int count=0;
        for (int i = 0; i < ikinciyol.length; i++) {
            for (int j = 0; j < sesliHarfler.length; j++) {
                if(ikinciyol[i].equalsIgnoreCase(sesliHarfler[j])){
                    count++;
                }
            }

        }
        System.out.println("count = " + count);


    }
}
