package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        LocalTime localTime = LocalTime.of(1, 1, 1);
        System.out.println("localTime = " + localTime);

        System.out.println(localTime.plusHours(1).plusMinutes(1).plusSeconds(1));
    }
}
