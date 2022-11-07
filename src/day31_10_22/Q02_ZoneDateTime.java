package day31_10_22;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q02_ZoneDateTime {
    //Asia / Tokyo da saat kaç
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("zone = " + zone);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//formatını değiştiriyoruz yandaki gibi bilmek gerek elle ise
        System.out.println("format = " + zone.format(format));


    }
}
