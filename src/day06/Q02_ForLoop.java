package day06;

public class Q02_ForLoop {
    public static void main(String[] args) {
      //  ****İNTERVİEWWW****
        //Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("****for çözümü******");
        for (int i = 0; i <= 255; i++) {

            System.out.println(i+"-->"+(char)(i));
                    }

        System.out.println("***While çözümü***");
        int a=0;
        while (a<=255){
            System.out.println(a+"--->"+(char)(a));
            a++;
        }
        System.out.println("****do-while çözümü****");
        int j=0;

        do {
            System.out.println(j+"--->"+(char)(j));
            j++;
        }while (j<=255);






    }
}
