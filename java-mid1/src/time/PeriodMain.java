package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        LocalDate localDate = LocalDate.of(2030, 1, 1);
        LocalDate plus = localDate.plus(period);
        System.out.println("plus = " + plus);

        LocalDate localDate1 = LocalDate.of(2023, 1, 1);
        LocalDate localDate2 = LocalDate.of(2023, 3, 3);
        Period between = Period.between(localDate1, localDate2);
        System.out.println("between = " + between);

    }
}
