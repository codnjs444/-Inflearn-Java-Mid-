package collection.set.member;

public class MemberNoHashNoEQ {
    private String id;

    public MemberNoHashNoEQ(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEQ{" +
                "id='" + id + '\'' +
                '}';
    }
}
