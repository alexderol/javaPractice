package InterviewQuestions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("birşeyler yazın");
        String str = scan.nextLine();
        System.out.println("bir sayı yazın");
        int sayi = scan.nextInt();

        System.out.println(döndürücü(str, sayi));


    }

    private static String döndürücü(String str, int sayi) {
        String istenen= str.substring(0,1)+str.substring(str.length()-1);

        System.out.println(istenen);

        String output = "";

        for (int i = 0; i < sayi; i++) {//birleşimden kaç yazdırcaksam onu forla yaparız
            output +=istenen;

        }


        return output;
    }


}
