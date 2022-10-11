package day07;

public class Q01_WhileDoWhile {
    //girilen sayının basamaklarındaki rakamları toplamını bulunuz
    public static void main(String[] args) {
        int sayi=45687;

        System.out.println(basamakToplamı(sayi));


        System.out.println("****doWhile çözüm****");
        int num= 123546987;
        int total=0;
        do {
            total+=num%10;
            num/=10;
        }while (num>=1);
        System.out.println(total);

        System.out.println("***For çözüm****");
        int a=564852;
        int komple=0;
        for (int i = 1; i <= a; i++) {
            komple+=i%10;
            i/=10;

        }
        System.out.println(komple);


    }

    private static int basamakToplamı(int sayi) {
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }


        return toplam;
    }


}
