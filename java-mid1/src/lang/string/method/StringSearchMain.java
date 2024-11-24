package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello Java! Welcome to Java world.";

        System.out.println("문자열에 'Java 포함여부 : " + str.contains("Java"));
        System.out.println("'Java' 첫 인덱스 : " +  str.indexOf("Java"));
        System.out.println("인덱스 10 부터 'Java' 인덱스 : " + str.indexOf("Java", 10));
        System.out.println("'Java'의 마지막 인덱스 : " + str.lastIndexOf("Java"));
        
    }
}
