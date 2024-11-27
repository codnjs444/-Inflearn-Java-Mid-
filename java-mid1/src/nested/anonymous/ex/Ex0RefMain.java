package nested.anonymous.ex;

public class Ex0RefMain {
    public static void powerOn(String name) {
        System.out.println("프로그램 시작");
        System.out.println(name);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        powerOn("helloJava");
        powerOn("helloSpring");
    }
}
