package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        // reflection 작업 활용
        
        // 동적으로 클래스 로드
        Class helloClass = Class.forName("lang.clazz.Hello");

        // 객체 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();

        System.out.println(helloClass.getDeclaredConstructor().newInstance());
        // 메서드 호출
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
