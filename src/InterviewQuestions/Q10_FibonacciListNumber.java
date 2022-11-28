package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
    public static void main(String[] args) {
        List<Integer> fibONACCI = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        System.out.println("fibONACCI oluşturmasını istediğiniz sayıyı yazınız");
        int sayi = scan.nextInt();
        fibONACCI.add(0);
        fibONACCI.add(1);
        int i = 1;
        if (sayi <= 1) {
            System.out.println("daha büyük sayı girin");

        } else {
            while (fibONACCI.get(i) < sayi) {//fibONACCI elemanları sayiden küçük olduğu sürece
                fibONACCI.add(fibONACCI.get(i) + fibONACCI.get(i - 1));//bir önceki eleman ile topla
                i++;
            }


        }
        if(fibONACCI.get(fibONACCI.size()-1)>sayi){//fibONACCI daki son elemon girilen sayıdan byükse
            fibONACCI.remove(fibONACCI.get(fibONACCI.size()-1));//son eleman kaldır demek
            System.out.println("girilen sayı fibONACCI dizisinde bulunmamaktadır\n--> "+fibONACCI);


        }else System.out.println("girilen sayı fibonacci dizisinde bulunmaktadır\n--> "+fibONACCI);



    }


}
