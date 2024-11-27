package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        LocalDate localDate = LocalDate.of(2011, 11, 11);
        System.out.println("localDate = " + localDate);

        System.out.println(localDate.plusDays(10));

    }
}

