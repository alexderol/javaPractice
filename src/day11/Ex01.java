package day11;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        // verilen String değerinin içerdiği karakter sayıların yazdıran code create edin+

        String str = "aemakiii ll eaae yaie arğnakiema kim//**-+;xw-/08976778";

        String benzersiz = "";

        for (int i = 0; i < str.length(); i++) {
            if (!benzersiz.contains("" + str.charAt(i))) {
                benzersiz += "" + str.charAt(i);

            }


        }

        for (int i = 0; i < benzersiz.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (benzersiz.charAt(i) == str.charAt(i)) {

                    count++;


            }
            }System.out.println("karakter " + benzersiz.charAt(i) + " = " + count);


        }


    }
}

