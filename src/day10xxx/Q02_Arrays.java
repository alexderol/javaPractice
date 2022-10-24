package day10xxx;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String cümle= "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println("cümle.replace(\" \", \"\").length() = " + cümle.replace(" ", "").length());

        System.out.println("Arrayli çözümü aşağıda \n\n");

        String [] cümleArr = cümle.replace(" ", "").split("");
        System.out.println(cümleArr.length);

    }
}
