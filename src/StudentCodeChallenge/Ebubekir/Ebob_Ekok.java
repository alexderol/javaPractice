package StudentCodeChallenge.Ebubekir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Ebob_Ekok {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("obebinin alınmasını istediğiniz iki sayıyı sırayla girin");
        x = scan.nextInt();
        y = scan.nextInt();

        
        System.out.println("ebob= "+obeb(x, y));
        System.out.println("ekok ="+ekok(x, y, obeb(x, y)));


    }

    private static int ekok(int x, int y, int obeb) {

        return x*y/obeb;
    }


    private static int obeb(int x, int y) {

        List<Integer> obeb = new ArrayList<>();
        for (int i = 1; i <= Math.max(x, y); i++) {
            for (int j = 1; j <= Math.min(x, y); j++) {
                if (x % i == 0 && y % j == 0) {
                    if (i == j) {
                        obeb.add(i);
                    }
                }


            }

        }


        return obeb.get(obeb.size()-1);
    }


}
