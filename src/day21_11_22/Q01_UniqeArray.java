package day21_11_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q01_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println("liste :" +list);
        int [] tekarsizArr  = new int [list.size()];
        for (int i = 0; i < tekarsizArr.length; i++) {
            tekarsizArr[i] = list.get(i);
        }
        System.out.println("array :" + Arrays.toString(tekarsizArr));


        //2 . yol
        HashSet<Integer> liste = new HashSet<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10));
        System.out.println("liste--> "+liste);





    }









}

