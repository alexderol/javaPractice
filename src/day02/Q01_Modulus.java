package day02;

public class Q01_Modulus {
    public static void main(String[] args) {

        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
// Hint: use / and %
//    input: 12345
//    output: 1
//            2
//            3
//            4
//            5

        int sayi = 12345;
        int birler = sayi%10;//5
        int onlar = (sayi/10)%10;//4;
        int yüzler = (sayi/100)%10;//3
        int binler = (sayi/1000)%10;//2
        int onbinler = (sayi/10000)%10;//1

        System.out.println( birler + "\n"+onlar + "\n"+yüzler + "\n"+binler+ "\n"+onbinler);











    }

}
