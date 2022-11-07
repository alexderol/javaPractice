package day31_10_22;

import java.time.LocalDateTime;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
        //local taime ile // her dakianın ilk 10 saniyesi
        LocalDateTime now= LocalDateTime.now();
        System.out.println("now = " + now);

        if(now.getSecond()<=10){
            System.out.println("evet");
        }else System.out.println("hayır");

    }
}
