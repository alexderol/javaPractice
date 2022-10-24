package day09;

import java.util.Arrays;

public class Q05_Arrays {
    /*
       Find the middle element in an integer array
       Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
                 (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
    */

    public static void main(String[] args) {
        int [] arr = {16,5,8,12,0};

        Arrays.sort(arr); //arr in elemanlarini siraladik..
        System.out.println(Arrays.toString(arr));
        int middleIndex = arr.length/2;

        if(arr.length%2!=0){ //arr in length tek ise
            System.out.println(arr[middleIndex]);
        }else{ //arr in length cift ise
            middleIndex = (arr[middleIndex] + arr[middleIndex-1])/2;
            System.out.println(middleIndex);
        }


        /*
       Find the middle element in an integer array
       Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
                 (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
    */


        int sayi1[]={10, 5, 6,23,36,35,36,32,36,323,36589,23,15,145,326,25,39};

        int ortancaSayı= sayi1.length/2;
        System.out.println("Arrays.toString(sayi1) = " + Arrays.toString(sayi1));
        if(sayi1.length%2!=0){
            System.out.println(sayi1[ortancaSayı]);
        }else System.out.println("sayı çift sayı elemanlı olduğu için ortanca sayısı yok");





    }


}
