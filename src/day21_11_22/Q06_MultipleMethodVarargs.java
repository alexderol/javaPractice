package day21_11_22;

public class Q06_MultipleMethodVarargs {
/*
farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
yazdıran parametreli method yazınız
*/
public static void main(String[] args) {

    ortalamaBul("erol",56,67,85,95,80,100);
    ortalamaBul("erva",75,80,64,95);
    ortalamaBul("halide",85,95,82,78);
    ortalamaBul("Mehmet",100,80,65,90,65);



}

    private static void ortalamaBul(String name, double...notlar ) {
    double sum=0;
        for (double w:notlar) {
            sum +=w;

        }
        System.out.println(name+ " -->not ortalaması: "+sum/ notlar.length);



    }


}
