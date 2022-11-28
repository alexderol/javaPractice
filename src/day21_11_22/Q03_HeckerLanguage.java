package day21_11_22;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_HeckerLanguage {
  //  / Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birşeyler yazın");
        String str = scan.nextLine();

        str=str.replaceAll("s", "5").replaceAll("a",  "4").replaceAll("e",  "3").replaceAll("i", "1").replaceAll("o", "0");
        System.out.println(str);


        arrayleCozDerlerse(str);




    }

    private static void arrayleCozDerlerse(String str) {
        String [] arr = new String[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.substring(i,i+1);
            if(arr[i].contains("s")) arr[i] ="5";
            else if (arr[i].contains("a")) arr[i] ="4";
            else if (arr[i].contains("e")) arr[i] ="3";
            else if (arr[i].contains("i")) arr[i] ="2";
            else if (arr[i].contains("o")) arr[i] ="1";

            }


        System.out.println(Arrays.toString(arr));
        }



    }


