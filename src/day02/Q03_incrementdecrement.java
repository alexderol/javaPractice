package day02;

public class Q03_incrementdecrement {
    public static void main(String[] args) {
        System.out.println("*****increment*******");


        int a = 1;
        System.out.println(++a);//2 a value 2
        System.out.println(a++);//2 value =3 a yaz value bir arttır
        System.out.println(a);//3

        System.out.println("********Decrement*******");

        int b= 5;

        System.out.println(--b);// önce b yi yaz 4 value 4
        System.out.println(b--);// önce yazdır sonra b yi bir azalt  value 3
        System.out.println(b);

        System.out.println("soru 1");
        int x = 20;
        int y= 15;
        System.out.println(++x + y-- );//x:21 sonuc 21 y:15 sonuc 14 x+y : 36
        System.out.println("x = "+ x);//21
        System.out.println("y = "+ y);//14

        System.out.println(++x + --y);//x:22 + y:13 =35
        System.out.println("x = "+ x);//22
        System.out.println("y = "+ y);//13

        System.out.println("***soru 2***");
               //value    6      7     8     7    6      //
        int k =5;        //6     6     7     7    7     6
        System.out.println(++k + k++ + k++ + --k + k-- + k);//39
        System.out.println("k = " + k);//6

        System.out.println("*****soru3*****");



    }



}
