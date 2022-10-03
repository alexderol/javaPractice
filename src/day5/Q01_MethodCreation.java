package day5;

import java.util.Scanner;

public class Q01_MethodCreation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String word = scan.nextLine().toLowerCase();

        System.out.println(xyzVarMı(word));
        xyzVarMiVoid(word);


    }

    private static void xyzVarMiVoid(String word) {
        System.out.println(word.contains("xyz")?"true":"false");//bu da olabilir aşağıdaki de olabilir
    }

    private static boolean xyzVarMı(String word) {
        if(word.contains("xyz")){
            return true;
                    }else
                        return false;



    }
}
