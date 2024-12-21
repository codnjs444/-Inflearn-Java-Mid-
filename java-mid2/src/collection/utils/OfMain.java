package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        System.out.println("list = " + list);

        Set<Integer> set = Set.of(1, 2, 3);
        System.out.println("set = " + set);

        Map<Integer, String> integerStringMap = Map.of(1, "one", 2, "two");
        System.out.println("integerStringMap = " + integerStringMap);
    }
}
