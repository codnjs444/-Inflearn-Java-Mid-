package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("strA.hasCode() = " + strA.hashCode());
        System.out.println("strAB.hasCode() = " + strAB.hashCode());

        System.out.println(("(-1).hasCode() = " + Integer.valueOf(-1).hashCode()));

        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        boolean b = member1 == member2;
        System.out.println("b = " + b);

        boolean equals = member1.equals(member2);

        System.out.println("equals = " + equals);
        System.out.println("member1 = " + member1.hashCode());
        System.out.println("member2 = " + member2.hashCode());


    }
}
