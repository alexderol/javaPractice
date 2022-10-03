package day04;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        /*
        girilen String içinde "xyz" dizimi var ise true değilse false return eden metod yazınız
        input   output
        axyzm == true
        xyz == true
        x.yzm == false
        xyaz == false
         */

        String s ="xyaz";

        Boolean xyzIceriyorMu = false;// ilk başta bişey bilmediğimiz için false olsun dedik
        if (s.contains("xyz")){
            xyzIceriyorMu = true;//biliyorsak artık true olsun dedik update ettik
            System.out.println(xyzIceriyorMu);
        }else {
            xyzIceriyorMu= false;// elsesi de false yaptık
            System.out.println(xyzIceriyorMu);
        }









    }

}
