package day10xxx;

import java.util.Arrays;

public class Q05_Arrays {
    public static void main(String[] args) {
        /*+
        find the middle elemnt in an integer array
        example : (10,5,6)---> (5,6,10)---> output =6
                   (16,5,8,10)--->(5,8,10,16)--->output= 8+10/2=9
         */

        int [] arr = {16,5,8,10};
        Arrays.sort(arr);
        int middleIndex= arr.length/2;

        if(arr.length%2!=0){
            System.out.println("ortanca eleman = "+arr[middleIndex]);
        }else
            middleIndex= (arr[middleIndex]+arr[middleIndex-1])/2;
        System.out.println(middleIndex);




        }



    }

