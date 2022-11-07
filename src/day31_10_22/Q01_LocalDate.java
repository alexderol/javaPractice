package day31_10_22;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Q01_LocalDate {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);
        LocalDate degisengun= bugun.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("degisengun = " + degisengun);
        LocalDate sonTarih=degisengun.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println("sonTarih = " + sonTarih);


    }







}
