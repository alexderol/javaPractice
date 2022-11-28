package InterviewQuestions;

import java.util.*;

public class Q14_AddedOrNotTask {
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
// count how many duplicates we have
// find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
// kaç tane tekrarli eleman olduğunu sayin
// yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        int tekrarliEleman=0;

        Set<Integer> uniqeNumbers = new HashSet<>();
        List<Integer> dublicatesNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            boolean ekliMi=uniqeNumbers.add(numbers.get(i));
            if(!ekliMi){
                tekrarliEleman++;
                dublicatesNumbers.add(numbers.get(i));
            }

        }
        System.out.println( "tekrarliEleman"+ tekrarliEleman+ " ");
        System.out.println( "dublicatesNumbers"+ dublicatesNumbers+ " ");



    }


















}
