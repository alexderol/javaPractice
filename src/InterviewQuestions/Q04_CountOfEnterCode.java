package InterviewQuestions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        int hak = 3;
        String pin = "şifre123";
        while (hak != 0) {
            System.out.println("giriş hakkınız = " + hak);
            Scanner scan = new Scanner(System.in);
            System.out.println("şifreyi giriniz");
            String sifre = scan.nextLine();
            if (sifre.equals(pin)) {
                System.out.println("şifre doğru....");
                break;

            } else System.out.println("hatalı giriş");
            hak--;
        }
        if (hak == 0) System.out.println("pin bloke edildi");


    }
}
