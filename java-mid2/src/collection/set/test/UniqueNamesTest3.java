package collection.set.test;

import java.util.*;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30,20,20,10,10));


        for (Integer a : set) {
            System.out.println(a);
        }
    }
}
