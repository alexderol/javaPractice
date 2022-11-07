package day31_10_22;

public class Q05_Varargs01 {
    public static void main(String[] args) {
        //istediğimiz kadar sayı girdiğimizde
        // toplamları bize veren method yazalım

        sumAll(5,9,-4,100,300);



    }

    private static void sumAll(int...a ) {
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }
        System.out.println("toplam = " + toplam);
    }
}
