package InterviewQuestions;

import java.util.Scanner;

public class Q07_IsDigit {
    /*
   Create a method that accepts a String as parameter and finds the sum of digits in that String.
   Example:
   input : J4\/4 1$ 34$¥
   output : 16

   Hint:
   Character.isDigit()
   Integer.valueOf()
  */
    public static void main(String[] args) {


        int top = 0;
        String bu = "J4\\/4 1$ 34$¥";
        for (int i = 0; i < bu.length(); i++) {
            if(Character.isDigit(bu.charAt(i))){
                top +=Integer.parseInt(String.valueOf(bu.charAt(i)));
            }
        }
        System.out.println(top);


    }


}
