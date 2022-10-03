package day01;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Q09_Scanner {
    //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
//  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
//  Isim – soyisim : Elly Dainty
//  Kullanicidan ismini alip isminin bas harfini yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //fSystem.out.println("Çemberin yarı çap değerini giriniz (r) ? =");
        //fdouble r = scan.nextDouble();
        //fdouble R = 2*3.14*r;
        //fSystem.out.println("R = " + R);
        //fdouble A = r*r*3.14;
        //fSystem.out.println("A = " + A);
//f

        //fSystem.out.println("Adınızı Giriniz = ");
        //fString Ad = scan.nextLine();
        //fSystem.out.println("Soyadınızı giriniz = ");
        //fString soy = scan.nextLine();
        //fSystem.out.println("Ad Soyad = "+ Ad +" "+ soy);
//f
        System.out.println("isminizi giriniz =");
        char ilkHarf = scan.next().charAt(0);// ismin ilk harfini almak istersek yapıyoruz
        System.out.println("ilkHarf = " + ilkHarf);


    }


}
