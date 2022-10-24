package day10;

public class C3_RandomFormula {
    public static void main(String[] args) {

        Math.random();  //0.0 ve 1.0 arasinda bir deger veriyor
        double random = Math.random();

        //eger tam sayi olarak bir deger istiyorsak *10 gibi bir sayi ile carpabiliriz.

        //eger ki bir deger araliginda olacak sekilde bir random rakam istiyorsak o zaman bize
        //verilen formulu kullanabiliriz.

        //(int) (Math.random() * ((max - min) + 1)) + min;// herhangi iki sayı arasında değer üretme

        int min=10;
        int max=67;

        int randomNum=(int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println("randomNum = " + randomNum);


    }



}
