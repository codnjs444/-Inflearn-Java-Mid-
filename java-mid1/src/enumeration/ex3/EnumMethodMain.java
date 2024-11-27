package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("value = " + value.name() + ", ordinal = " + value.ordinal());
        }

        String input = "GOLD";
        System.out.println("input = " + input);
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
