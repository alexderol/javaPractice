package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q15_MapKeysValues {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
//5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
//5 tane ulke ismi yazdırıyoruz. (keyset())
//5 tane ulke nufusunu yazdırıyoruz. (values())
//nüfusların toplamını yazdırın.
//kaç tane 50 milyondan fazla nüfuslu ülke var?
// ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {

        HashMap<String,Integer> ulke = new HashMap<>();
        ulke.put("Almanya",80);
        ulke.put("Turkiye",83);
        ulke.put("Amerika",250);
        ulke.put("Fransa",70);
        ulke.put("Kanada",40);
        System.out.println("ulke isimleri ve nufusları: \n"+ulke+ " milyon");
        System.out.println("ulke.keySet() = " + ulke.keySet());
        System.out.println("ulke.values() = " + ulke.values());

        int ellidenBuyukUlkeSayısı=0;
        for (Integer w: ulke.values()) {
            if(w>50){
              ellidenBuyukUlkeSayısı++;
            }

        }
        int toplamNufs=0;
        for (Integer w: ulke.values()) {
            if(w>50){
                toplamNufs+=w;
            }

        }
        System.out.println("nufs toplamı = "+ toplamNufs);


       for (Map.Entry<String,Integer> siralama : ulke.entrySet()){
           System.out.println(siralama);
       }


       for (Integer ulkeNufs : ulke.values()){
           System.out.println(ulkeNufs);
       }

       ulke.keySet().stream().forEach(t-> System.out.println(t));


       /*
        HashMap<String, Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 70);
        ulke.put("Kanada", 40);
        System.out.println("ulke isimleri ve nufuslari :\n" + ulke + " milyondur");
        System.out.println("ulke isimleri : " + ulke.keySet());
        System.out.println("ulke nufuslari :" + ulke.values());

        int ellidenBuyukSayisi = 0;
        for (Integer buyukMu: ulke.values()
             ) {
            if(buyukMu>50){
                ellidenBuyukSayisi++;
            }
        }
        System.out.println("ellidenBuyukSayisi = " + ellidenBuyukSayisi);
        int toplam = 0;
        for (Integer topla:ulke.values()
             ) {
            toplam+=topla;
        }
        System.out.println("toplam = " + toplam);
        for (Map.Entry<String, Integer>siralama :ulke.entrySet() // key +value
             ) {
            System.out.println(siralama);
        }
        for (String ulkeSira: ulke.keySet() // sadece key
             ) {
            System.out.println(ulkeSira);
        }
        for (Integer ulkeNufus: ulke.values() // sadece values
        ) {
            System.out.println(ulkeNufus);
        }



        */


    }
}
