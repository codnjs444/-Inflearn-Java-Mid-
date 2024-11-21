package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberV1 = new MemberV2("회원A", address);
        MemberV2 memberV2 = new MemberV2("회원B", address);

        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);

//        memberV2.getAddress().setValue("부산");

        System.out.println("부산 -> memberV2.address");
        memberV2.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);
    }
}
