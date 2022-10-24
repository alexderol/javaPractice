package day10xxx;

public class Q01_Arrays {
    public static void main(String[] args) {
        //Type a method to check if an int Array is symmetrical or not?
        int arr []={1,2,3,2,1};

        System.out.println("symmetrical(arr) = " + symmetrical(arr));

        //method oluştur boolean flag oluştur sonra ilk ve son elemanları karşılaştırma mantığıyla ilerle
        //i denk mi çünkü i 0 dan başlayacak i 0 sa son eleman da simetri olması için arr[arr.length-1-i] şeklinde olmalı


    }

    private static boolean symmetrical(int[] arr) {
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==arr[arr.length-1-i]){
                flag=true;
            }else
                flag=false;
            break;



        }


        return flag;
    }

}
