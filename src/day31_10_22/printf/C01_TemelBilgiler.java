package day31_10_22.printf;

public class C01_TemelBilgiler {
    //https://www.digitalocean.com/community/tutorials/java-printf-method
    public static void main(String[] args) {
        int sayi = 753;
        String str = "Bootcamp Clarusway";
        double db = 3.89563056;
        System.out.println(sayi + "-" + str + "-" + db);//clasic yöntem 753-Bootcamp Clarusway-3.89563056
        System.out.printf("sayi :%d,str :%s,db :%f\n",sayi,str,db);//sayi :753,str :Bootcamp Clarusway,db :3.895631

        System.out.printf("sayi :%d,str :%S,db :%f\n", sayi,str,db);//sayi :753,str :BOOTCAMP CLARUSWAY,db :3.895631

        System.out.printf("sayi :%10d,str :%-10.10S,db : %-5.3f\n", sayi,str,db);//sayi :       753,str :BOOTCAMP C,db : 3.896
                  //%10d->10 hanelik yer ayır, kapasite
        //%--20.10S--> sola yaslayarak 20 birimlik kapasite ver, String ifadeyi büyük harfle 10 karakter yazdır demek oluyor
        //%-5.3f--> (-)solay yaslayarak 5 birimlik kapasite ver ve virgül sonrası 3 hane yazdır
        //\n--> new line yeni satıra gec
        //%x.y --> x:sayı kapasitesi, y:karakter sayısı
        //%- kullanmak sola yasla demek
        //%S --> büyük harf yazdır
        //%s --> küçük harf yazdır
        System.out.printf("sayi :%-10d,str :%-8.8s,db :%07.4f\n",sayi,str,db);//sayi :753       ,str :Bootcamp,db :03.8956
        System.out.printf("sayi :%-10d,str :%-8.8s,db :%010.4f\n",sayi,str,db);//sayi :753       ,str :Bootcamp,db :00003.8956

    }
}
