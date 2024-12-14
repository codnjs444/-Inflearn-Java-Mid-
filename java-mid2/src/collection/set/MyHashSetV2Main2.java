package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);

        set.add("BC");
        set.add("AD");
        System.out.println("set = " + set);

        Member member2 = new Member("BC");
        int hashCode = member2.hashCode();
        System.out.println("hashCode = " + hashCode);
        System.out.println("set.contains(133) = " + set.contains(2113));

        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
