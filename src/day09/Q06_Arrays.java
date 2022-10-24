package day09;

public class Q06_Arrays {
    public static void main(String[] args) {


        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

         */
        int arr1[][] = {{0, 2, -1}, {3, 8, 9}, {7}};
        int arr2[][] = {{-7, 6, -9}, {0, 12}, {19}};
        int toplam1 = 0;
        int toplam2 = 0;
        // int toplam [][]= new int[][];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[j].length; j++) {
                toplam1 += arr1[i][j];

            }

        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[j].length; j++) {
                toplam2 += arr1[i][j];

            }

        }
        System.out.println("toplam= " + toplam1 + toplam2);


    }
}
