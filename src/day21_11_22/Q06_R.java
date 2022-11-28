package day21_11_22;

public class Q06_R {
    /*
farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
yazdıran parametreli method yazınız
*/
    public static void main(String[] args) {
        notOrtalamasıAl("erva",75,96,84,80,70,96,100,100);
        notOrtalamasıAl("erol",80,96,36,32,45,96,23,11);
        notOrtalamasıAl("Halide",75,35,36,32,45,96,10,14);




    }

    private static void notOrtalamasıAl(String name, int...notlar) {
        int sum=0;
        for (Integer each:notlar) {
            sum +=each;

        }
        System.out.println(name+" isimli ogrencinin not ortalaması ="+ sum/ notlar.length);
    }
}
