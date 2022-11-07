package InterviewQuestions;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /*
    * Kullanicidan bir cumle ve bir harf alin,
    * Cumlede harfin kac kere
    * kullanildigini bulup, yazdirin
    * ORNEK:
    * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
    *
    * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle yazın");
        String cumle = scan.nextLine();
        System.out.println("hangi harfin yazdığınız cümlede kaç kez geçtiğini öğrenmek istersiniz");
        char ch = scan.next().toLowerCase().charAt(0);
        int count =0;

        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==ch)count++;

        }
        System.out.println(ch+" karakterinin sayısı "+count);




    }



}
