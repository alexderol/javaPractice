package InterviewQuestions;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı yazınız ");
        int sayi = Math.abs(scan.nextInt());
        boolean flag = true;
        if (sayi == 1) {
            System.out.println("asal sayılar 2 den başlar");
        } else {

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    flag = true;
                    break;
                } else flag = false;
            }
            if (flag == true) System.out.println("number is prime number");
            else if (flag == false) System.out.println("number is not prime number");
        }
    }

    /*
    public static boolean isPrime(int a){
    int count=0;
    for (int i = 2; i <=a ; i++) {
        count+=a%i==0?1:0;
    }
    return count==1;
}


     */


}
