package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEQ m1 = new MemberNoHashNoEQ("A");
        MemberNoHashNoEQ m2 = new MemberNoHashNoEQ("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);

        MemberNoHashNoEQ searchValue = new MemberNoHashNoEQ("A");
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
