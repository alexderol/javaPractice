package day04;

public class Q03_StringManipulation {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.
        // kelimeyi sayiya dönüştür methodu...

         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */
        //çözüm//
        String str1 = "$13.99";//dolar işaretinden kurtulmak istiyoruz 1399 oldu
        str1 = str1.replaceAll("\\D", "");
        System.out.println("str1 = " + str1);
        String str2 = "$10.55";//dolardan kurtulmak istiyoruz çünkü toplamak istiyoruz 1055 oldu
        str2 = str2.replaceAll("\\D", "");
        System.out.println("str2 = " + str2);
        System.out.println("str1+str2 = " + str1 + str2);//13991055 string olduğu için kelime gibi düşünük yanyana yazar
        //eğer içeriğinin tamamen sayı olduğunu bildiğimiz String varsa parseDouble() veya parseInteger() kullanılır
        double sayı1 = Double.parseDouble(str1); // String olan str1 ve str2 sayı olan sayı1 ve sayı2 ye dönüştürüldü ve toplama işlemi yapabilirsiniz
        double sayı2 = Double.parseDouble(str2);
        double toplam = (sayı1 + sayı2) / 100;// yüze bölmemizin nedeni , olduğu için doları da başına koyduk sorunun ilk hali gibi
        System.out.println("toplam = " + "$" + toplam);
        ///önce sayı dışındaki tüm karakterlerden kurtul sonra Stringi toplama çıkarma vs için double a çevir ve işlem yap sonra virgül kadar bölme koy sonra yazdırırken doları vs kuruttuğun karakterleri geri getir



    }


}

