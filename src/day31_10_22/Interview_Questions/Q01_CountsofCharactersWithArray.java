package day31_10_22.Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsofCharactersWithArray {

    /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1

 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir şeyler yazın");
        String str = scan.nextLine();

        //split
        String [] arr =str.split("");//hiçlikle böldük
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int count = 0;

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1].equals(arr[i])){//birden fazla sayıdak karakter için
                count++;
            }else {
                System.out.println(arr[i] + " karakterinden  "+ (count+1) + " adet var" );
                count=0;
            }
            if(i==arr.length-1){//en sonki karakter için yazdık
                System.out.println(arr[i]+" karakterinden "+(count+1)+" adet var");
            }
        }


        /*


         Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = scan.nextLine();
        //split
        String [] arr = str.split(""); //her bir karakteri ayirir
        System.out.println(Arrays.toString(arr));
        //sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //count :sayac olustur
        int counter = 0;
        //karakterleri karsilastirmak icin for loop
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1].equals(arr[i])){ //birden fazla sayidaki karakter icin
                counter++;
            }else{ //tek sayidaki karakter
                System.out.println(arr[i-1] + " sayisi " + (counter+1));
                counter =0;
            }
            if(i==arr.length-1){//en son karakter benzersiz ise calisir
                System.out.println(arr[i] + " sayisi " + (counter+1)) ;
            }
        }
    }

         */



    }


}
