package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_DifferenceBetwenArray_LargestAndSmallestElements {
/*Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("array uzunluğu girin");
    int sayi = scan.nextInt();
    int arr []= new int[sayi];
    for (int i = 0; i < sayi; i++) {
        System.out.println("arrayin " +(i+1)+". elemanı");
        arr[i]= scan.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Difference = "+(arr[sayi-1]-arr[0]));




}



}
