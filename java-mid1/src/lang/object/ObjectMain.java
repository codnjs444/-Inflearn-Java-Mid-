package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // 객체에 대한 정보 반환
        String string = child.toString();
        System.out.println(string);
    }
}
