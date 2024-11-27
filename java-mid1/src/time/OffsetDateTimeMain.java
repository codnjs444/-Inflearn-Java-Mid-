package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 60);
        System.out.println("localDateTime = " + localDateTime);

    }
}
