package day01;

import java.util.Scanner;

public class Q08_Scanner
{

    // kullanicidan 2 tam sayi alin
// bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayıyı girin = ");
        int num1 = scan.nextInt();
        System.out.println("ikinci sayıyı girin = ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("toplam"+"\t"+sum);


    }

}
