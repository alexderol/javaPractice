package day09;

import java.util.Arrays;

public class Q04_Arrays {
    /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                a e i o u */

    public static void main(String[] args) {
        String s= "Apex,nesne yonelimli bir programlama dilidir";
        s = s.replace(",","").replace(" ", "");
        System.out.println(s); //Apexnesneyonelimlibirprogramlamadilidir

        String []arr = s.split("");
        System.out.println(Arrays.toString(arr));//[A, p, e, x, n, e, s, n, e, y, o, n, e, l, i, m, l, i, b, i, r, p, r, o, g, r, a, m, l, a, m, a, d, i, l, i, d, i, r]

        String [] sesliHarfler = {"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliHarfler)); //[a, e, i, o, u]

        int count =0;
        for (int i = 0; i < arr.length; i++) { //outer loop
            for (int j = 0; j < sesliHarfler.length; j++) {//inner loop
                if(arr[i].equalsIgnoreCase(sesliHarfler[j])){
                    //arr deki herhangi bir karakter, sesli harflerdeki bir karaktere buyuk kucuk harf farketmezksizin esitese
                    count++; //sesli harf saysisini 1 artir
                }
            }
        }

        System.out.println("count = " + count);


        System.out.println("\n\n benim yaptığım çalışma \n");


        /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                a e i o u */
        String denem="Arraysleri anladığım zaman bu işin bir çoğunu halletmiş olacağım";
        String denemArr[]= denem.split("");
        String sesli[]={"i","a","e","o","u","ı"};
        int sesliHarfSayısı=0;
        for (int i=0; i< denemArr.length; i++){
            for(int j = 0; j < sesli.length; j++){
                if(denemArr[i].equalsIgnoreCase(sesli[j])){
                    sesliHarfSayısı++;

                }
            }

        }
        System.out.println("sesliHarfSayısı = " + sesliHarfSayısı);


    }


}
